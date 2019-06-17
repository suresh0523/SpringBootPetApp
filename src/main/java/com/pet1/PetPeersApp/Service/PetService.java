package com.pet1.PetPeersApp.Service;

import java.util.List;


import com.pet1.PetPeersApp.Model.PetDetails;

public interface PetService {
	public PetDetails savePet(PetDetails petDetails);
	
	public List<PetDetails> getAllPets();
	public List<PetDetails> getMyPets(Long ownerUserId);
}
