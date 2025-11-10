package com.sparklead.sharaspot.ui.repositories

import com.sparklead.sharaspot.models.ChargingStationResponse
import kotlinx.coroutines.flow.Flow

interface ChargingStationRepository {

    fun getChargingStationList(): Flow<ArrayList<ChargingStationResponse>>

}