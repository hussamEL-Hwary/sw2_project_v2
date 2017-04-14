package gameappl.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import gameappl.domain.Date;
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	private String name;
	private String password;
	private int age;
	private String mail;
	private String gender;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Student(int id, String name, String password, int age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
