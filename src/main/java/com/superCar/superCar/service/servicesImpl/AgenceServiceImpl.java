package com.superCar.superCar.service.servicesImpl;

import com.superCar.superCar.model.entities.Agence;
import com.superCar.superCar.model.entities.Vehicule;
import com.superCar.superCar.model.repositories.AgenceRepository;
import com.superCar.superCar.model.repositories.VehiculeRepository;
import com.superCar.superCar.service.AgenceService;
import com.superCar.superCar.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgenceServiceImpl implements AgenceService {
    @Autowired
    private AgenceRepository agenceRepository;

    @Override
    public Agence getOne(Integer n) {
        return agenceRepository.findOne(n);
    }

    @Override
    public List<Agence> getAll() {
        return agenceRepository.findAll();
    }
}
