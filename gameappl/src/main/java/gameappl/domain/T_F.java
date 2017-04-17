package gameappl.domain;

import java.util.ArrayList;

import javax.persistence.Entity;

@Entity
public class T_F extends Game {


	private ArrayList<TFQuestion>  content;

	
	public T_F(ArrayList<TFQuestion> content) {
		super();
		this.content = content;
	}

	public T_F() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<TFQuestion> getContent() {
		return content;
	}

	public void setContent(ArrayList<TFQuestion> content) {
		this.content = content;
	}
	
	
	


	
}
