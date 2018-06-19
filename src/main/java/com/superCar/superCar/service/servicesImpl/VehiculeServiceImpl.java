package com.superCar.superCar.service.servicesImpl;

import com.superCar.superCar.model.entities.Vehicule;
import com.superCar.superCar.model.repositories.VehiculeRepository;
import com.superCar.superCar.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculeServiceImpl implements VehiculeService {
    @Autowired
    private VehiculeRepository vehiculeRepository;

    @Override
    public Vehicule getOne(Integer n) {
        return vehiculeRepository.findOne(n);
    }

    @Override
    public List<Vehicule> getAll() {
        return vehiculeRepository.findAll();
    }
}
