package gameappl.repo;

import javax.transaction.Transactional;

import gameappl.domain.T_F;

/**
 * class T_FRepo  extends JpaRepository to execute query 
 * @author Hussam
 *
 */
@Transactional
public interface T_FRepo extends GameBaseRepo<T_F> {

}
