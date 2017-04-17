package gameappl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import gameappl.domain.Category;
import gameappl.repo.CategoryRepo;

@Controller
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryRepo catRepo;   //to execute Category Query
	
	//return all categories in database
	@RequestMapping("/allcat")
    public String listCat(Model model) {
        model.addAttribute("categories",catRepo.findAll());
		
		return "categories";
    }
	
	@GetMapping("/saveCate")
	public String saveCategory(
			@RequestParam("newCategory") String categoryName
			){
		Category categoryToSave=new Category(categoryName);
		catRepo.save(categoryToSave);
		return "teacherView";
		
	}
}
