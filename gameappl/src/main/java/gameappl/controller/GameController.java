package gameappl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import gameappl.repo.CategoryRepo;
import gameappl.repo.GameRepo;
import gameappl.repo.T_FRepo;

@Controller
@RequestMapping("/game")
public class GameController {

	@Autowired
	private CategoryRepo catRepo;
	
	@Autowired
	private GameRepo gameRepo;
	@Autowired
	private T_FRepo tfRepo;
	
	@RequestMapping("/create")
	public String takeGameInfo(Model model)
	{
		model.addAttribute("categories",catRepo.findAll());
		model.addAttribute("games",tfRepo.findAll());
		
		return "createGame";
	}
	
}
