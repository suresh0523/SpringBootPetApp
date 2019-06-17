package com.pet1.PetPeersApp.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pet1.PetPeersApp.Model.PetDetails;
@Repository
public interface PetRepository extends JpaRepository<PetDetails, Long>{

	
	
}
