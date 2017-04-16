package gameappl.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Category {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(unique=true)
	private String name;
	
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
