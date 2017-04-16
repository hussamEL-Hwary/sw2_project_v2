package gameappl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import gameappl.domain.Category;
import gameappl.repo.CategoryRepo;

@Controller
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryRepo catRepo;   //to execute Category Query
	
	//return all categories in database
	@GetMapping("/allcat")
	public List<Category> findAllCategory()
	{
		return catRepo.findAll();
	}
}
