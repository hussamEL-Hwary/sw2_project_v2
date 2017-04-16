package gameappl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import gameappl.domain.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer> {

}
