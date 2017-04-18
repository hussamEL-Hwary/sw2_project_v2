package gameappl.domain;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class T_F extends Game {


	private ArrayList<String>  question=new ArrayList<String>();
	private ArrayList<Boolean>  answer=new ArrayList<Boolean>();
	
	
	
	public T_F(ArrayList<String> question, ArrayList<Boolean> answer) {
		super();
		this.question = question;
		this.answer = answer;
	}
	public T_F() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArrayList<String> getQuestion() {
		return question;
	}
	public void setQuestion(ArrayList<String> question) {
		this.question = question;
	}
	public ArrayList<Boolean> getAnswer() {
		return answer;
	}
	public void setAnswer(ArrayList<Boolean> answer) {
		this.answer = answer;
	}
	
	
	
}
