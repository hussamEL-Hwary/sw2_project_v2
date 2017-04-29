package gameappl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import gameappl.domain.Student;
import gameappl.repo.StudentRepo;

/**
 * Controller class for mapping student services functions
 * 
 * @author Hussam
 *
 */
@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentRepo studentRepo;

	/**
	 * find all student
	 * 
	 * @return Json of student
	 */
	@GetMapping(path = "/all")
	public @ResponseBody List<Student> findall() {
		return studentRepo.findAll();
	}

	/**
	 * @return signup teacher view
	 */
	@RequestMapping("/signup_student")
	public String signup_student() {
		return "signup_student";
	}

	/**
	 * add new student in database has unique email
	 * 
	 * @param name
	 * @param email
	 * @param password
	 * @param age
	 * @param gender
	 * @return generalView for student to log in or duplicate user
	 */

	@GetMapping("/add_st_DB")
	public String add_st_DB(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("password") String password, @RequestParam("age") int age,
			@RequestParam("gender") String gender) {
		// create new student to save in student database
		Student studentToSave = new Student(name, password, age, email, gender);
		Student checkStudent=studentRepo.findByMail(email);
		//check
		if(checkStudent!=null)
		{
			
				return "duplicatUser";
		}
		studentRepo.save(studentToSave);
		// return the generalView page to user
		return "generalView";
	}

}// class StudentController
