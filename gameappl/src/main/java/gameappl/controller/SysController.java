package gameappl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gameappl.domain.Student;
import gameappl.domain.Teacher;

@Controller
public class SysController {
	
	@RequestMapping("/")
	public String generalView(){
		return "generalView";
	}
	
	@RequestMapping("/signup_teacher")
	public String signup_teacher(){
		return "signup_teacher";
	}

	@RequestMapping("/signup_student")
	public String signup_student(){
		return "signup_student";
	}
	@RequestMapping("/add_st_DB")
	public String add_st_DB(
			@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			@RequestParam("age") int age,
			@RequestParam("gender") String gender
			){
		Student obj = new Student();
		obj.setName(name);
		obj.setMail(email);
		obj.setPassword(password);
		obj.setAge(age);
		obj.setGender(gender);
		
		return "done";
	}
	@RequestMapping("/add_te_DB")
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
}
