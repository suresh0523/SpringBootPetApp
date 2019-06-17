package com.pet1.PetPeersApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pet1.PetPeersApp.Model.UserRegistration;
import com.pet1.PetPeersApp.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepo;
	
	
	
	@Override
	public String addUser(UserRegistration userRegistration) {

		if(userRepo.findByUserName(userRegistration.getUserName())==null) {
		 if(userRepo.save(userRegistration)==null)
			 return "user not created successfully";
		 else
			 return userRegistration.getUserName()+" successfully Created";
		}else{
			return userRegistration.getUserName()+" already existed";
		}
	}

	@Override
	public String userAuthentication(String username, String passWord){
		if (userRepo.findByUserNameAndPassword(username, passWord)==null)
		return "user details are missmatched";
		else
			return "login successfully";
		
	}

	//@Override
//	public UserRegistration userExistence(int id) {
//
//		return userRepo.findByUserRegistrationId(id);
//
//	}

	@Override
	public String userChecking() {
		// TODO Auto-generated method stub
		return null;
	}

}
