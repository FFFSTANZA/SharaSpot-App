package com.sparklead.sharaspot.services;

import com.sparklead.sharaspot.models.ChargingStation;
import com.sparklead.sharaspot.repositories.ChargingStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChargingStationServiceImp implements ChargingStationService{

    @Autowired
    private ChargingStationRepository chargingStationRepository;

    @Override
    public Integer postStation(ChargingStation chargingStation) {
        return chargingStationRepository.save(chargingStation).getStationId();
    }

    @Override
    public List<ChargingStation> getStationList() {
        return chargingStationRepository.findAll();
    }
}