package com.sparklead.sharaspot.ui.states

import com.sparklead.sharaspot.models.ChargingStationResponse

sealed class ChargingStationUiState {

    object Loading : ChargingStationUiState()

    data class Success(val list: ArrayList<ChargingStationResponse>) : ChargingStationUiState()

    data class Error(val message : String) : ChargingStationUiState()
}