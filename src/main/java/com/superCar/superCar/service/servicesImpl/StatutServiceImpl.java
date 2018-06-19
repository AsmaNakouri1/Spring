package com.superCar.superCar.service.servicesImpl;

import com.superCar.superCar.model.entities.Statut;
import com.superCar.superCar.model.repositories.StatutRepository;
import com.superCar.superCar.service.StatutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatutServiceImpl implements StatutService {
    @Autowired
    private StatutRepository statutRepository;

    @Override
    public Statut getOne(Integer n) {
        return statutRepository.findOne(n);
    }

    @Override
    public List<Statut> getAll() {
        return statutRepository.findAll();
    }
}
