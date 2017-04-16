package gameappl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import gameappl.domain.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer> {

}
