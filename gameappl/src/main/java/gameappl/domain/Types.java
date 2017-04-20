package gameappl.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * Entity type class represent game type
 * @author Hussam
 *
 */
@Entity
public class Types {
	//==============
	//PRIVATE FIELDS
	//==============  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String name;
	
   //==============
   //PUBLIC METHODS
   //==============
   /**
    * Default constructor
    */
	public Types() {
	super();
	}
	/**
	 * parameterize constructor 
	 * @param name
	 */
	public Types(String name) {
	super();
	this.name = name;
    }
	/**
	 * 
	 * @return type id
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
	 * @return type name
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
