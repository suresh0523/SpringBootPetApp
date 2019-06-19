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
	
	public String savePet(PetDetails petDetails) {
		
		//return petRepo.save(petDetails);
		if (petRepo.save(petDetails) != null)
			return "Pet details saved successfully";
		else
			return "Something went wrong please try again";
	}
		//return petDetails;
		
	

	@Override
	public List<PetDetails> getAllPets() {
		
		
		return petRepo.findAll();
		
	}

	@Override
	public List<PetDetails> getMyPets(Long userRegistationId) {
		return petRepo.findAll(userRegistationId);
	}

//	@Override
//	public PetDetails buyPet(PetDetails petDetails) {
//		
//		
//		petDetails.setPetAction("Buy");
//		
//		return petRepo.save(petDetails);
//		
//		
//	
//	}
}
