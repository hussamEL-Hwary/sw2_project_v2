package gameappl.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gameappl.domain.Game;
import gameappl.domain.ScoreDetail;
import gameappl.domain.Student;
import gameappl.domain.T_F;
import gameappl.domain.Teacher;
import gameappl.repo.CategoryRepo;
import gameappl.repo.GameRepo;
import gameappl.repo.StudentRepo;
import gameappl.repo.T_FRepo;
import gameappl.repo.TeacherRepo;
/**
 * Controller class 
 * @author Hussam
 *
 */
@Controller
public class SysController {
	
	// ==============
	// PRIVATE FIELDS
	// ==============
	
	private Student systemStudent;
	private Teacher systemTeacher;
	private String gameType;
	private String gameCat;
	private String gameName;
	private Game currentGame;
	private T_F currentT_F;
	private int TFcounter=0;
	private ArrayList<String>currentQues;
	private ArrayList<Boolean>currentAnswers;
	private int TFCurrentScore=0;
	//execute student query
	@Autowired
	private StudentRepo studentRepo;
	//execute teacher query
    @Autowired
    private TeacherRepo teacherRepo;
    @Autowired
    private T_FRepo tfRepo;
    @Autowired
    private CategoryRepo catRepo;
    @Autowired
    private GameRepo gameRepo;
    
    //===============
    //PIUBLIC METHODS
    //===============
    
    /**
     * @return genralView of main page
     */
	@RequestMapping("/")
	public String generalView(){
	return "generalView";
	}
	
    /**
     * check the user of the system  
     * @return view of system student or teacher
     */
	@RequestMapping("/check")
	public String check_DB(Model model,
			@RequestParam("mail")String mail,
			@RequestParam("password")String password
			){
		systemStudent=studentRepo.findByMailAndPassword(mail,password);
		systemTeacher=teacherRepo.findByMailAndPassword(mail,password);
		if(systemStudent!=null)
		{
			model.addAttribute("categories",catRepo.findAll());
			model.addAttribute("categories",catRepo.findAll());
		    return"studentView";
		}
		else if(systemTeacher!=null)
			return "teacherView";
		
		return "generalView";
	}
	
	/**
	 * find the view of filling game based on game type
	 * @param typ
	 * @param cat
	 * @param nam
	 * @return  gamecontent or back to filling form
	 */
	@RequestMapping("/fillgame")
	public String findGameType(
			@RequestParam("type") String typ,
			@RequestParam("category") String cat,
			@RequestParam("name") String nam
			)
	{
		gameType=typ;
		gameCat=cat;
		gameName=nam;
		if(gameType.equals("TF"))
			return "GameContent";
		else
		return "createGame";
		
	}
	/**
	 * most stupid idea in the world 
	 *save true false game type in db  
	 * @param q1
	 * @param a1
	 * @param q2
	 * @param a2
	 * @param q3
	 * @param a3
	 * @param q4
	 * @param a4
	 * @param q5
	 * @param a5
	 * @return teacher view
	 */
	@RequestMapping("/save")
	public String saveGame(
			@RequestParam("name1") String q1,
			@RequestParam("select1") boolean a1 ,
			@RequestParam("name2") String q2,
			@RequestParam("select2") Boolean a2,
			@RequestParam("name3") String q3,
			@RequestParam("select3") Boolean a3,
			@RequestParam("name4") String q4,
			@RequestParam("select4") Boolean a4,
			@RequestParam("name5") String q5,
			@RequestParam("select5") Boolean a5
			)
	{
		T_F gameToSave=new T_F();
		ArrayList<String>  question=new ArrayList<String>();
		ArrayList<Boolean>  answer=new ArrayList<Boolean>();
		question.add(q1);
		question.add(q2);
		question.add(q3);
		question.add(q4);
		question.add(q5);
		answer.add(a1);
		answer.add(a2);
		answer.add(a3);
		answer.add(a4);
		answer.add(a5);
		
		gameToSave.setCreatorName(systemTeacher.getName());
		gameToSave.setName(gameName);
		gameToSave.setType(gameType);
		gameToSave.setCategory(gameCat);
		gameToSave.setQuestion(question);
		gameToSave.setAnswer(answer);
		tfRepo.save(gameToSave);
		return "teacherView";
	}
	
	
	/**
	 * find game by name 
	 * @return page of playing game  
	 */
	@RequestMapping("/findgame")
	public String findGame(Model model,
			@RequestParam("game") String gamename
			)
	{
		
		currentGame=gameRepo.findByName(gamename);
		
		if(currentGame.getType().equals("TF"))
		{
			currentT_F=(T_F) currentGame;
			currentQues=currentT_F.getQuestion();
			currentAnswers=currentT_F.getAnswer();
	     	model.addAttribute("questions",currentQues.get(0));
	     	TFcounter++;
	     	return "playing";	
		}
		return "";
	}

	/**
	 * make student play game
	 * @param model
	 * @param playerAnswer
	 * @return score page or other question page
	 */
	@RequestMapping("/nextQues")
	public String nextQuestion(Model model, @RequestParam("ans")String playerAnswer)
	{
		if((playerAnswer.equals("true")&&currentAnswers.get(TFcounter-1)==true)||
		   (playerAnswer.equals("false")&&currentAnswers.get(TFcounter-1)==false))
		 TFCurrentScore++;
			
		if(TFcounter==currentQues.size())
		{
			boolean found=false;
			int maxResult=TFCurrentScore;
			ArrayList<ScoreDetail>check=new ArrayList<ScoreDetail>();
			if(systemStudent.getMyScores()!=null)
			check=systemStudent.getMyScores();
			if(check!=null){
			for(int i=0;i<check.size();i++)
			{
				if(check.get(i).getGameName().equals(currentT_F.getName()))
					{
					maxResult=Math.max(maxResult,check.get(i).getScore());
					check.get(i).setScore(maxResult);
					
					found=true;
					break;
					}
					
			}
			}
			if(found==false){
			ScoreDetail added=new ScoreDetail(currentT_F.getName(),maxResult);
			System.out.println(currentT_F.getName());
			System.out.println(maxResult);
			check.add(added);
			}
			systemStudent.setMyScores(check);
			//studentRepo.save(systemStudent);//cant update student
			TFCurrentScore=0;
			TFcounter=0;
			return "done"; //
			
		}
		else {
			model.addAttribute("questions",currentQues.get(TFcounter));
			TFcounter++;
			return "playing";
		}
		
	}
	
	
	
}
