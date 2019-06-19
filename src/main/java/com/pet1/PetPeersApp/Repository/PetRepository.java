package com.pet1.PetPeersApp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pet1.PetPeersApp.Model.PetDetails;
@Repository
public interface PetRepository extends JpaRepository<PetDetails, Long>{
	
	@Query(value = "select * from pet_appnew.pet_info  where pet_id=?1 ", nativeQuery = true)
	public  PetDetails getPetDetails(Long petId);
	
	@Query(value="select * from pet_appnew.pet_info where user_reg_user_registation_id=?1",nativeQuery=true)
	List<PetDetails> findAll(Long userId);
	
}
