package gameappl.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity teacher class to represent teacher in db
 * @author Hussam
 *
 */
@Entity
@Table(name="teacher")
public class Teacher {
    
	//==============
	//PRIVATE FIELDS
	//==============
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String password;
	private int age;
	private String mail;
	private String gender;
	
	//==============
	//PUBLIC METHODS
	//==============
	
	
	/**
	 * Parameterize constructor
	 * @param name
	 * @param password
	 * @param age
	 * @param mail
	 * @param gender
	 */
	public Teacher(String name, String password, int age, String mail, String gender) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
		this.mail = mail;
		this.gender = gender;
	}
	
	/**
	 * Default constructor
	 */
	public Teacher() {
		super();
		
	}

	/**
	 * 
	 * @return teacher id
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @param id The id to set
 	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 
	 * @return teacher name
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name The name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return teacher password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 
	 * @param password The password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 
	 * @return teacher age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * 
	 * @param age The age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * 
	 * @return teacher mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * 
	 * @param mail The mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * 
	 * @return teacher gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * 
	 * @param gender The gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}// class Teacher
