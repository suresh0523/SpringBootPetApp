package com.pet1.PetPeersApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pet1.PetPeersApp.Model.PetDetails;
import com.pet1.PetPeersApp.Repository.PetRepository;

@Service
public class PetServiceImple implements PetService{

	@Autowired
	PetRepository petRepo;
	
	public PetDetails savePet(PetDetails petDetails) {
		
		return petRepo.save(petDetails);
		//return petDetails;
		
	}

	@Override
	public List<PetDetails> getAllPets() {
		
		
		return petRepo.findAll();
		
	}

	@Override
	public List<PetDetails> getMyPets(Long ownerUserId) {
		// TODO Auto-generated method stub
		return null;
	}
}
