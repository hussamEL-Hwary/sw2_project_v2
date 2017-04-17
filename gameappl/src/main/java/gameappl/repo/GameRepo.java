package gameappl.repo;

import javax.transaction.Transactional;

import gameappl.domain.Game;

@Transactional
public interface GameRepo extends GameBaseRepo<Game> {

}
