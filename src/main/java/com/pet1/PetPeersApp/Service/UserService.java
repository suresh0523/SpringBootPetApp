package com.pet1.PetPeersApp.Service;

import com.pet1.PetPeersApp.Model.UserRegistration;

public interface UserService {

	public String addUser(UserRegistration userRegistration);
	public String userAuthentication(String userName,String password);
	public String userChecking();
	
}
