package com.sparklead.sharaspot.serviceImp

import com.sparklead.sharaspot.models.ChargingStationResponse
import com.sparklead.sharaspot.remote.HttpRoutes
import com.sparklead.sharaspot.service.ChargingStationService
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.url
import io.ktor.http.ContentType
import io.ktor.http.contentType

class ChargingStationServiceImp(private val client: HttpClient) : ChargingStationService {
    override suspend fun getChargingStationList(): ArrayList<ChargingStationResponse> {
        return client.get<ArrayList<ChargingStationResponse>> {
            url(HttpRoutes.STATION_LIST)
            contentType(ContentType.Application.Json)
        }
    }
}