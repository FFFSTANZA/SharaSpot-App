package com.sparklead.sharaspot.ui.states

import com.sparklead.sharaspot.models.ChargingStationResponse

sealed class MapDetailUiState {

    object Loading : MapDetailUiState()

    data class Success(val list: ArrayList<ChargingStationResponse>) : MapDetailUiState()

    data class Error(val message: String) : MapDetailUiState()
}