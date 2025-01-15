package com.example.badminton.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.badminton.model.Manager;



@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface ManagerRepository extends CrudRepository<Manager, Integer> {

}