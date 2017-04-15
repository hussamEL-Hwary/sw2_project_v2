package gameappl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import gameappl.domain.ScoreDetail;
import gameappl.domain.Student;
import gameappl.repo.ScoreDetailRepo;
import gameappl.repo.StudentRepo;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	
	private StudentRepo studentRepo;
	@Autowired
	private ScoreDetailRepo sRepo;
	
	
	@GetMapping(path="/all")
	public @ResponseBody List<Student> findall(){
	return studentRepo.findAll();
	}
	
	@GetMapping(path="/thi")
	public @ResponseBody List<ScoreDetail>ff()
	{
		return sRepo.findAll();
	}
	
	
}
