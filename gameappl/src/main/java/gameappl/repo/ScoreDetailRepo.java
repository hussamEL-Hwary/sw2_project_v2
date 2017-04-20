package gameappl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import gameappl.domain.ScoreDetail;

/**
 * class ScoreDetailRepo  extends JpaRepository to execute query 
 * @author Hussam
 *
 */
public interface ScoreDetailRepo extends JpaRepository<ScoreDetail,Long> {
	

}
