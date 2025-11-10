package com.sparklead.sharaspot.repositories;

import com.sparklead.sharaspot.models.ChargingStation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChargingStationRepository extends MongoRepository<ChargingStation,Integer> {

}