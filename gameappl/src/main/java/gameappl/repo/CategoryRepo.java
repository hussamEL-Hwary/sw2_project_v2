package gameappl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import gameappl.domain.Category;
/**
 * class CategoryRepo extends JpaRepository to execute query 
 * @author Hussam
 *
 */
public interface CategoryRepo extends JpaRepository<Category,Integer> {

}
