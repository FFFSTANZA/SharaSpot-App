package com.sparklead.sharaspot.services;

import com.sparklead.sharaspot.models.ChargingStation;

import java.util.List;

public interface ChargingStationService {


    Integer postStation(ChargingStation chargingStation);

    List<ChargingStation> getStationList();
}