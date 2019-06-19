package com.pet1.PetPeersApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_info")
public class UserRegistration {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long userRegistationId;
private String userName;
private String password;
public UserRegistration() {
	super();
	
}
public UserRegistration(Long userRegistationId, String userName, String password) {
	super();
	this.userRegistationId = userRegistationId;
	this.userName = userName;
	this.password = password;
}
public Long getUserRegistationId() {
	return userRegistationId;
}
public void setUserRegistationId(Long userRegistationId) {
	this.userRegistationId = userRegistationId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "UserRegistration [userRegistationId=" + userRegistationId + ", userName=" + userName + ", password="
			+ password + "]";
}
	
}
