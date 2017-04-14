package gameappl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import gameappl.domain.Student;
import gameappl.repo.StudentRepo;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	
	StudentRepo rp;

	@RequestMapping("/findall")
    @ResponseBody
	public List<Student> findall(){
	return rp.findAll();
	}
	
}
