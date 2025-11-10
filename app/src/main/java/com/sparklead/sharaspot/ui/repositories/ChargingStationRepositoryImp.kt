package com.sparklead.sharaspot.ui.repositories

import com.sparklead.sharaspot.models.ChargingStationResponse
import com.sparklead.sharaspot.service.ChargingStationService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ChargingStationRepositoryImp @Inject constructor(private val service: ChargingStationService) :
    ChargingStationRepository {
    override fun getChargingStationList(): Flow<ArrayList<ChargingStationResponse>> {
        return flow {
            emit(service.getChargingStationList())
        }
    }

}