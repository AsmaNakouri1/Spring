package com.superCar.superCar.service;

import com.superCar.superCar.model.entities.Vehicule;

import java.util.List;

public interface VehiculeService {
	public Vehicule getOne(Integer id);
	public List<Vehicule> getAll();
}
