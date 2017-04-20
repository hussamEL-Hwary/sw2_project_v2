package gameappl.repo;

import java.util.ArrayList;

import javax.transaction.Transactional;

import gameappl.domain.Game;

/**
 * class GameRepo  extends JpaRepository to execute query 
 * @author Hussam
 *
 */
@Transactional
public interface GameRepo extends GameBaseRepo<Game> {

	public ArrayList<Game> findByCategory(String category);
}
