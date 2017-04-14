package gameappl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import gameappl.domain.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {


}
