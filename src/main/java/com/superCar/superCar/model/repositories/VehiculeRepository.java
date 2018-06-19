package com.superCar.superCar.model.repositories;

import com.superCar.superCar.model.entities.Vehicule;
import org.springframework.data.repository.CrudRepository;

import java.util.List;



public interface VehiculeRepository extends CrudRepository<Vehicule, Integer> {
	@Override
	Vehicule findOne(Integer integer);

	@Override
	List<Vehicule> findAll();
}
