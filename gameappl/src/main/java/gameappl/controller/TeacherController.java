package gameappl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gameappl.domain.Teacher;
import gameappl.repo.TeacherRepo;

/*
 * teacher controller class 
 * make services function to help teacher to 
 * sign up ,
 * */
@Controller
@RequestMapping("/teacher")
public class TeacherController {
	
	//to execute teacher query
	@Autowired
	private TeacherRepo teacherRepo; 
	
	//this function return the form view to user
	@RequestMapping("/signUpForm")
	public String SignUpForm()
	{
		return "signup_teacher";
	}

	@RequestMapping("/addTeacher")
	public String addTeacherToDB(
			@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			@RequestParam("age") int age,
			@RequestParam("gender") String gender
			){
		Teacher teacherToSave=new Teacher(name,password,age,email,gender);
		teacherRepo.save(teacherToSave);
		
		return "generalView";
		
	}
	
}
