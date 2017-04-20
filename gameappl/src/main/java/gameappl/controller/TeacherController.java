package gameappl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import gameappl.domain.Teacher;
import gameappl.repo.TeacherRepo;

/**
 * teacher controller class 
 * make services function  
 * @author Hussam
 * */
@Controller
@RequestMapping("/teacher")
public class TeacherController {

	// to execute teacher query
	@Autowired
	private TeacherRepo teacherRepo;

	/**
	 * 
	 * @return form view to user
	 */
	@RequestMapping("/signUpForm")
	public String SignUpForm() {
		return "signup_teacher";
	}
	
    /**
     * add teacher in db
     * @param name
     * @param email
     * @param password
     * @param age
     * @param gender
     * @return generalView for teacher to log in
     */
	@RequestMapping("/addTeacher")
	public String addTeacherToDB(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("password") String password, @RequestParam("age") int age,
			@RequestParam("gender") String gender) {
		Teacher teacherToSave = new Teacher(name, password, age, email, gender);
		teacherRepo.save(teacherToSave);

		return "generalView";

	}

}//class TeacherController
