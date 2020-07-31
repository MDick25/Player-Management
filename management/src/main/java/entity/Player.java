package entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Player extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	@Column(length = 1000, nullable = false)
	private String skills;
	private int height;
	private Long weight;
	
	public Player() {}
	
	public Player(String skills, int height, Long weight,  Long id, String name, String phone, String address, LocalDate birthDate, String login, String password, boolean status) {
		super(id ,name, phone, address, birthDate, login, password, status);
		this.skills = skills;
		this.height = height;
		this.weight = weight;
		
	}
	
	public String getSkills() {
		return skills;
	}
	
	public void setSkills( String skills) {
		this.skills = skills;
		
	}
	
	

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Long getWeight() {
		return weight;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Player [skills=" + skills + "]";
	}
	
	


}
