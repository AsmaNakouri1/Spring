package com.superCar.superCar.controller;

import com.superCar.superCar.model.entities.Agence;
import com.superCar.superCar.service.AgenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AgenceController {
	@Autowired
	private AgenceService agenceService;
	
	@RequestMapping("/agence/all")
	public ResponseEntity<List<Agence>>getAllAgences() {
		return new ResponseEntity<List<Agence>>(agenceService.getAll(), HttpStatus.OK);
	}

	@RequestMapping("/getagence")
	public ResponseEntity<Agence>getVehicule(@RequestParam("id") Integer id) {
		return new ResponseEntity<Agence>(agenceService.getOne(id), HttpStatus.OK);
	}
}
