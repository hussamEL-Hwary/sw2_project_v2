package gameappl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gameappl.domain.Game;
import gameappl.domain.T_F;
import gameappl.repo.CategoryRepo;
import gameappl.repo.GameRepo;
import gameappl.repo.T_FRepo;
import gameappl.repo.TypesRepo;
/**
 * controller class to make game services functions
 * @author Hussam
 *
 */
@Controller
@RequestMapping("/game")
public class GameController {

	// ==============
	// PRIVATE FIELDS
	// ==============
    
	@Autowired
	private CategoryRepo catRepo;
	
	@Autowired
	private GameRepo gameRepo;
	
	@Autowired
	private T_FRepo tfRepo;
	
	@Autowired
	private TypesRepo typeRepo;
	
	// ==============
    // PUBLIC METHODS
    // ==============
	
	/**
	 * get types of games and categories for user to select
	 * @param model
	 * @return createGame View 
	 */
	@GetMapping("/create")
	public String takeGameInfo(Model model){
		model.addAttribute("types",typeRepo.findAll());
		model.addAttribute("categories",catRepo.findAll());
		return "createGame";
	}
	
	/**
	 * get all games in specific category for user to select one to play
	 * @param model
	 * @param catName
	 * @return view of games
	 */
	@RequestMapping("/showgames")
	public String gamesInCategory(Model model,
			@RequestParam("category") String catName
			)
	{
		model.addAttribute("games", gameRepo.findByCategory(catName));
		return "Game";
	}
	
		
}//class GameController
