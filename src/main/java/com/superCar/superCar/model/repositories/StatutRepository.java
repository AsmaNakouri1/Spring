package com.superCar.superCar.model.repositories;

import com.superCar.superCar.model.entities.Statut;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface StatutRepository extends CrudRepository<Statut, Integer> {
	@Override
	Statut findOne(Integer integer);

	@Override
	List<Statut> findAll();
}
