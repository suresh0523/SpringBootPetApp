package com.pet1.PetPeersApp.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pet1.PetPeersApp.Model.PetDetails;

@Service
public interface PetService {
	
	public String savePet(PetDetails petDetails);
	public List<PetDetails> getAllPets();
	public List<PetDetails> getMyPets(Long userRegistationId);
	//public PetDetails buyPet(PetDetails petDetails);
	
}
