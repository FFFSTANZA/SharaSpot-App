package com.sparklead.sharaspot.service

import com.sparklead.sharaspot.models.ChargingStationResponse

interface ChargingStationService {

    suspend fun getChargingStationList(): ArrayList<ChargingStationResponse>

}