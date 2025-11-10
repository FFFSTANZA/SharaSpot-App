package com.sparklead.sharaspot.serviceImp

import com.sparklead.sharaspot.models.User
import com.sparklead.sharaspot.remote.HttpRoutes
import com.sparklead.sharaspot.service.UserService
import io.ktor.client.HttpClient
import io.ktor.client.request.put
import io.ktor.client.request.url
import io.ktor.http.ContentType
import io.ktor.http.contentType

class UserServiceImp(private val client: HttpClient) : UserService {

    override suspend fun updateUser(id: String, user: User): String {
        return try {
            client.put {
                url("${HttpRoutes.updateUser}/$id")
                contentType(ContentType.Application.Json)
                body = user
            }
        } catch (e: Exception) {
            throw e
        }
    }
}