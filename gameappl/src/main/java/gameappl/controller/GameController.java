package gameappl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gameappl.repo.CategoryRepo;
import gameappl.repo.GameRepo;
import gameappl.repo.T_FRepo;
import gameappl.repo.TypesRepo;

@Controller
@RequestMapping("/game")
public class GameController {

	
	@Autowired
	private CategoryRepo catRepo;
	
	@Autowired
	private GameRepo gameRepo;
	@Autowired
	private T_FRepo tfRepo;
	@Autowired
	private TypesRepo typeRepo;
	@GetMapping("/create")
	public String takeGameInfo(Model model){
		model.addAttribute("types",typeRepo.findAll());
		model.addAttribute("categories",catRepo.findAll());
		
		
		return "createGame";
	}
	
	@RequestMapping("/showgames")
	public String gamesInCategory(Model model,
			@RequestParam("category") String catName
			)
	{
		model.addAttribute("games", gameRepo.findByCategory(catName));
		return "Game";
	}
	
	
	//@RequestMapping("/fill")
	//public String 
	
}
