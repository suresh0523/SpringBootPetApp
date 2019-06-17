package com.pet1.PetPeersApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pet1.PetPeersApp.Model.UserRegistration;
@Repository
public interface UserRepository extends JpaRepository<UserRegistration, Long>{

	public UserRegistration findByUserName(String userName);

	public UserRegistration findByUserNameAndPassword(String username, String passWord);

	//public UserRegistration findByUserRegistrationId(int id);

	
	
}
