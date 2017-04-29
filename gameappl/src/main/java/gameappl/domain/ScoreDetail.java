package gameappl.domain;


public class ScoreDetail {


	private String gameName;
	private int score;
	
	
	public ScoreDetail()
	{}
	public ScoreDetail(String name,int score)
	{
		this.gameName=name;
		this.score=score;
		
	}

	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}
