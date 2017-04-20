package gameappl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import gameappl.domain.Types;

/**
 * class TypesRepo extends JpaRepository to execute query 
 * @author Hussam
 *
 */
public interface TypesRepo extends JpaRepository<Types,Long> {

}
