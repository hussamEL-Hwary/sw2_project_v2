package gameappl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import gameappl.domain.Teacher;

/**
 * class TeacherRepo  extends JpaRepository to execute query 
 * @author Hussam
 *
 */
public interface TeacherRepo extends JpaRepository<Teacher, Integer> {

	public Teacher findByMailAndPassword(String mail,String password);
}
