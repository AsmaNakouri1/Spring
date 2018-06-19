package com.superCar.superCar.model.repositories;

import com.superCar.superCar.model.entities.Agence;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface AgenceRepository extends CrudRepository<Agence, Integer> {
	@Override
	Agence findOne(Integer integer);

	@Override
	List<Agence> findAll();
}
