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
import gameappl.domain.Student;
import gameappl.domain.T_F;
import gameappl.domain.Teacher;
import gameappl.repo.CategoryRepo;
import gameappl.repo.StudentRepo;
import gameappl.repo.T_FRepo;
import gameappl.repo.TeacherRepo;

@Controller
public class SysController {
	
	Student systemStudent;
	Teacher systemTeacher;
	String gameType;
	String gameCat;
	String gameName;
	
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
	
	@RequestMapping("/save")
	public String saveGame(
			@RequestParam("name1") String q1,
			@RequestParam("select1") boolean a1 ,
			@RequestParam("name2") String q2,
			@RequestParam("select2") String a2,
			@RequestParam("name3") String q3,
			@RequestParam("select3") String a3,
			@RequestParam("name4") String q4,
			@RequestParam("select4") String a4,
			@RequestParam("name5") String q5,
			@RequestParam("select5") String a5
			)
	{
		T_F gameToSave=new T_F();
		ArrayList<String>  question=new ArrayList<String>();
		ArrayList<Boolean>  answer=new ArrayList<Boolean>();
		question.add(q1);
		question.add(q1);
		question.add(q1);
		question.add(q1);
		question.add(q1);
		gameToSave.setCreatorName(systemTeacher.getName());
		gameToSave.setName(gameName);
		gameToSave.setType(gameType);
		gameToSave.setCategory(gameCat);
		gameToSave.setQuestion(question);
		gameToSave.setAnswer(answer);
		tfRepo.save(gameToSave);
		return "teacherView";
	}
	
	/*@RequestMapping("/lol")
	public String gView(){
		System.out.println(systemTeacher.getName());
	return "done";
	}
	
	//@RequestMapping("/login")
	//public String 
	
	
	
	/*
	@RequestMapping("/signup_teacher")
	public String signup_teacher(){
		
		return "signup_teacher";
	}

	
	
	
	@RequestMapping(path="/add_te_DB",method=RequestMethod.POST)
	public String add_te_DB(
			@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			@RequestParam("age") int age,
			@RequestParam("gender") String gender
			){
		Teacher obj = new Teacher();
		obj.setName(name);
		obj.setMail(email);
		obj.setPassword(password);
		obj.setAge(age);
		obj.setGender(gender);
		
		return "done";
	}
	*/
}
