package com.example.badminton.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.badminton.model.Renter;


@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface RenterRepository extends CrudRepository<Renter, Integer> {
	
	Renter findByPhone(String phone);
}
