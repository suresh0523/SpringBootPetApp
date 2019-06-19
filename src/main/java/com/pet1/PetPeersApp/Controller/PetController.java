package com.pet1.PetPeersApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pet1.PetPeersApp.Model.PetDetails;
import com.pet1.PetPeersApp.Service.PetService;

@RestController
@RequestMapping
public class PetController {
	
	@Autowired
	PetService petServiceImple;
	
	@PostMapping("/pets/addPet")
	public String addPet(@RequestBody PetDetails petDetails)
	{
		//return petServiceImple.savePet(petDetails);
		
		if (petServiceImple.savePet(petDetails) != null)
			return "saved succesfully!";
		else
			return "something went worng...Please try later!";
		
	}
	
	@GetMapping("/pets")
	public List<PetDetails> petHome() {
		return petServiceImple.getAllPets();
		
	}
	@GetMapping("/myPets/{userRegistationId}")
	public List<PetDetails> myPets(@RequestParam Long userRegistationId){
		return petServiceImple.getMyPets(userRegistationId);		
	}
	
	
//	@PostMapping("/pet/buyPet")
//	public PetDetails buyPet(@RequestBody PetDetails petDetails) {
//		return petServiceImple.buyPet(petDetails);
//		
//	}
	

}