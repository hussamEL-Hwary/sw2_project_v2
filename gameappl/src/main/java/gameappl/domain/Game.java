package gameappl.domain;

import java.util.ArrayList;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
/**
 * Entitiy Game Class to keep track of game basic content
 * @author Hussam
 *
 */
@Entity
@Inheritance
public abstract class Game {

	//==============
	//PRIVATE FILEDS
	//===============
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(unique=true) 
	@NotNull
	private String name;
	 
	@NotNull
	private String creatorName;
	
	@NotNull
	private String type;
	@NotNull
	private String category;
	private double rate;
	
	private ArrayList<String> comments=new ArrayList<String>();

	//===============
	//PUBLIC METHODS
	//===============
	
	/**
	 * 
	 * @return game id
	 */
	public int getId() {
		return id;
	}
    /**
     * @param id the id to set
     */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return game name
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
	 * @return game creator
	 */
	public String getCreatorName() {
		return creatorName;
	}
    /**
     * 
     * @param creatorName The creatorname to set
     */
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}
   /**
    * 
    * @return game type
    */
	public String getType() {
		return type;
	}
    /**
     * 
     * @param type The game type to set
     */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 
	 * @return game category
	 */
	public String getCategory() {
		return category;
	}
    /**
     * 
     * @param category The game category to set
     */
	public void setCategory(String category) {
		this.category = category;
	}
    /**
     * 
     * @return game rate
     */
	public double getRate() {
		return rate;
	}
    /**
     * 
     * @param rate The game rate to set
     */
	public void setRate(double rate) {
		this.rate = rate;
	}
    /**
     * 
     * @return game comments
     */
	public ArrayList<String> getComments() {
		return comments;
	}
    /**
     * 
     * @param comments The game comments to set
     */
	public void setComments(ArrayList<String> comments) {
		this.comments = comments;
	}

	
}//clas Game
