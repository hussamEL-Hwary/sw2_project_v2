package gameappl.domain;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class T_F extends Game {


	private String question;
	private boolean answer;
	
	
	
	public T_F() {
		super();
		// TODO Auto-generated constructor stub
	}
	public T_F(String question, boolean answer) {
		super();
		this.question = question;
		this.answer = answer;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public boolean isAnswer() {
		return answer;
	}
	public void setAnswer(boolean answer) {
		this.answer = answer;
	}
	
	
	


	
}
