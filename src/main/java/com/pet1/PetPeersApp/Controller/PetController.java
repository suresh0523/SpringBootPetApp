package com.pet1.PetPeersApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pet1.PetPeersApp.Model.PetDetails;
import com.pet1.PetPeersApp.Service.PetServiceImple;

@RestController
@RequestMapping
public class PetController {
	
	@Autowired
	PetServiceImple petServiceImple;
	
	@PostMapping("pets/addPet")
	public PetDetails addPet(@RequestBody PetDetails petDetails)
	{
		return petServiceImple.savePet(petDetails);
		
	}
	
	@GetMapping("/pets")
	public List<PetDetails> petHome() {
		return petServiceImple.getAllPets();
		
	}

}
