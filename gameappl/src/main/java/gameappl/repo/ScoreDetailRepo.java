package gameappl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import gameappl.domain.ScoreDetail;

public interface ScoreDetailRepo extends JpaRepository<ScoreDetail,Long> {
	

}
