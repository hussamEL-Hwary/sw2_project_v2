package gameappl.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import gameappl.domain.Game;

/**
 * gamebase class 
 * @author Husaam
 *
 * @param <T>
 */
@NoRepositoryBean
public interface GameBaseRepo<T extends Game> extends CrudRepository<T, Long> {
	

}
