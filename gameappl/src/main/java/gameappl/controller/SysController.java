package gameappl.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import gameappl.domain.Game;
import gameappl.domain.Student;
import gameappl.domain.T_F;
import gameappl.domain.Teacher;
import gameappl.repo.StudentRepo;
import gameappl.repo.T_FRepo;

@Controller
public class SysController {
	
    @Autowired
	private StudentRepo studentRepo;
	
    @Autowired
    private T_FRepo tfRepo;
    
    
	@RequestMapping("/")
	public String generalView(){
	/*	T_F gam=new T_F();
		gam.setCreatorName("hussam");
		gam.setName("weka");
		gam.setRate(20);
		gam.setType("TorF");
		gam.setQuestion("Is apple Company?");
		gam.setAnswer(true);
	   
	   tfRepo.save(gam);
	  */ 
		return "teacherView";
	//return "generalView";
	}
	/*
	@RequestMapping("/signup_teacher")
	public String signup_teacher(){
		
		return "signup_teacher";
	}

	
	
	@RequestMapping("/check_DB")
	public String check_DB(){
		
		
		return"teacherView";
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
