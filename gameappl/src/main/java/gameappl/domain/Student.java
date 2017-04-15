package gameappl.domain;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student {
    
    private int id;
	private String name;
	private String password;
	private int age;
	private String mail;
	private String gender;
	private Set<ScoreDetail>myScores;
	
	public Student(int id, String name, String password, int age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		
	}
	public Student() {
		super();
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	/*
	@OneToMany(mappedBy = "Student", cascade = CascadeType.ALL)
	public Set<ScoreDetail> getmyScore()
	{
		return myScores;
	}
	
	public void setmyScore(Set<ScoreDetail> scores)
	{
		this.myScores=scores;
	}
	
	/*@Override
	public String toString(){
		String result=String.format("Student[id=%d,name='%s',passwors='%s',age='%s',mail='%s',gender='%s']",
				id,name,password,age,mail,gender);
		if(myScores!=null)
		{
			for(ScoreDetail score:myScores)
			{
				result+=String.format("ScoreDetail[id=%d,name='%s',score=%d]",score.getId(),score.getGameName(),score.getScore() );
			}
		}
		return result;
	}
	*/
	
}
