package gameappl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import gameappl.domain.Student;

/**
 * class StudentRepo  extends JpaRepository to execute query 
 * @author Hussam
 *
 */
public interface StudentRepo extends JpaRepository<Student, Long> {

public Student findByMailAndPassword(String mail,String password);
}
