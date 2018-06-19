package com.superCar.superCar.controller;

import java.util.List;

import com.superCar.superCar.model.entities.Vehicule;
import com.superCar.superCar.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class VehiculeController {
	@Autowired
	private VehiculeService vehiculeService;
	
	@RequestMapping("/vehicule/all")
	public ResponseEntity<List<Vehicule>>getAllVehicules() {
		return new ResponseEntity<List<Vehicule>>(vehiculeService.getAll(), HttpStatus.OK);
	}

	@RequestMapping("/getvehicule")
	public ResponseEntity<Vehicule>getVehicule(@RequestParam("id") Integer id) {
		return new ResponseEntity<Vehicule>(vehiculeService.getOne(id), HttpStatus.OK);
	}
}
