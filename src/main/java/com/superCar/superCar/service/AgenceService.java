package com.superCar.superCar.service;

import com.superCar.superCar.model.entities.Agence;

import java.util.List;

public interface AgenceService {
	public Agence getOne(Integer id);
	public List<Agence> getAll();
}
