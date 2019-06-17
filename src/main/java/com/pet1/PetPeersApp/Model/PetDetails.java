package com.pet1.PetPeersApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="pet_info")
public class PetDetails {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)	
	private Integer petId;
	private Integer petAge;
	private String petName;
	private String petPlace;
	private String petAction;
	
	private Long ownerUserId;
	private Long buyerUserId;
	
	public PetDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Integer getPetId() {
		return petId;
	}


	public void setPetId(Integer petId) {
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


	public void setPetPlace(String petPlace) {
		this.petPlace = petPlace;
	}


	public PetDetails(Integer petId, Integer petAge, String petName, String petPlace, String petAction,Long ownerUserId,long buyerUserId) {
		super();
		this.petId = petId;
		this.petAge = petAge;
		this.petName = petName;
		this.petPlace = petPlace;
		this.petAction = petAction;
		this.ownerUserId = ownerUserId;
		this.buyerUserId=buyerUserId;
	}


	


	public Long getOwnerUserId() {
		return ownerUserId;
	}


	public void setOwnerUserId(Long ownerUserId) {
		this.ownerUserId = ownerUserId;
	}


	public Long getBuyerUserId() {
		return buyerUserId;
	}


	public void setBuyerUserId(Long buyerUserId) {
		this.buyerUserId = buyerUserId;
	}


	@Override
	public String toString() {
		return "PetDetails [petId=" + petId + ", petAge=" + petAge + ", petName=" + petName + ", petPlace=" + petPlace
				+ ", petAction=" + petAction + ", ownerUserId=" + ownerUserId + ", buyerUserId=" + buyerUserId + "]";
	}
	
	
	
	
}
