package gameappl.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ScoreDetail {

	private int id;
	private String gameName;
	private int score;
	private Student student;
	
	public ScoreDetail()
	{}
	public ScoreDetail(String name,int score,Student student)
	{
		this.gameName=name;
		this.score=score;
		this.student=student;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	/*@ManyToOne
	@JoinColumn(name="student_id")
	public Student getStudent()
	{
		return student;
	}
	
	public void setStudent(Student student)
	{
		this.student=student;
	}
	*/
	
	
}
