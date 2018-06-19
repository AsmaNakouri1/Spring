package com.superCar.superCar.controller;

import com.superCar.superCar.model.entities.Statut;
import com.superCar.superCar.service.StatutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StatutController {
	@Autowired
	private StatutService statutService;
	
	@RequestMapping("/status/all")
	public ResponseEntity<List<Statut>>getAllStatus() {
		return new ResponseEntity<List<Statut>>(statutService.getAll(), HttpStatus.OK);
	}

	@RequestMapping("/getstatus")
	public ResponseEntity<Statut>getStatut(@RequestParam("id") Integer id) {
		return new ResponseEntity<Statut>(statutService.getOne(id), HttpStatus.OK);
	}
}
