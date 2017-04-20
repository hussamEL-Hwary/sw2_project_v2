package gameappl.domain;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *Entity class extends Game class to represent T_F game  
 * @author Hussam
 *
 */
@Entity
public class T_F extends Game {

    //==============
	//PRIVATE FIELDS
	//==============
	
	private ArrayList<String>  question=new ArrayList<String>();
	private ArrayList<Boolean>  answer=new ArrayList<Boolean>();
	
	//==============
	//PUBLIC METHODS
	//==============
	
	/**
	 * Parameterize constructor
	 * @param question
	 * @param answer
	 */
	public T_F(ArrayList<String> question, ArrayList<Boolean> answer) {
		super();
		this.question = question;
		this.answer = answer;
	}
	/**
	 * Default constructor
	 */
	public T_F() {
		super();
		
	}
	/**
	 * 
	 * @return questions
	 */
	public ArrayList<String> getQuestion() {
		return question;
	}
	/**
	 * 
	 * @param question The questions to set
	 */
	public void setQuestion(ArrayList<String> question) {
		this.question = question;
	}
	/**
	 * 
	 * @return game answers
	 */
	public ArrayList<Boolean> getAnswer() {
		return answer;
	}
	/**
	 * 
	 * @param answer The answer to set
	 */
	public void setAnswer(ArrayList<Boolean> answer) {
		this.answer = answer;
	}
	
	
	
}// class T_F
