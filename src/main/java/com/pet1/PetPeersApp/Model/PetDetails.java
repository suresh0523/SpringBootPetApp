package com.pet1.PetPeersApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pet_info")
public class PetDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long petId;
	private Integer petAge;
	private String petName;
	private String petPlace;
	private String petAction;

	@ManyToOne
	UserRegistration userReg;

	public PetDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getPetId() {
		return petId;
	}

	public void setPetId(Long petId) {
		this.petId = petId;
	}

	public String getPetAction() {
		return petAction;
	}

	public void setPetAction(String petAction) {
		this.petAction = petAction;
	}

	public Integer getPetAge() {
		return petAge;
	}

	public void setPetAge(Integer petAge) {
		this.petAge = petAge;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetPlace() {
		return petPlace;
	}

	public UserRegistration getUserReg() {
		return userReg;
	}

	public void setUserReg(UserRegistration userReg) {
		this.userReg = userReg;
	}

	public void setPetPlace(String petPlace) {
		this.petPlace = petPlace;
	}

	/*
	 * public PetDetails(Integer petId, Integer petAge, String petName, String
	 * petPlace, String petAction) { super(); this.petId = petId; this.petAge =
	 * petAge; this.petName = petName; this.petPlace = petPlace; this.petAction =
	 * petAction;
	 * 
	 * }
	 */

	@Override
	public String toString() {
		return "PetDetails [petId=" + petId + ", petAge=" + petAge + ", petName=" + petName + ", petPlace=" + petPlace
				+ ", petAction=" + petAction + ", userReg=" + userReg + "]";
	}

}
