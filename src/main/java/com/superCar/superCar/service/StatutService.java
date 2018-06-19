package com.superCar.superCar.service;

import com.superCar.superCar.model.entities.Statut;

import java.util.List;

public interface StatutService {
	public Statut getOne(Integer id);
	public List<Statut> getAll();
}
