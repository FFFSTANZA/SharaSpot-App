package com.sparklead.sharaspot.serviceImp

import android.util.Log
import com.sparklead.sharaspot.models.SignInRequest
import com.sparklead.sharaspot.models.SignInResponse
import com.sparklead.sharaspot.models.SignUpRequest
import com.sparklead.sharaspot.models.SignUpResponse
import com.sparklead.sharaspot.remote.HttpRoutes
import com.sparklead.sharaspot.service.AuthService
import io.ktor.client.HttpClient
import io.ktor.client.request.post
import io.ktor.client.request.url
import io.ktor.http.ContentType
import io.ktor.http.contentType

class AuthServiceImp(private val client: HttpClient) : AuthService {

    override suspend fun signUpUser(signUpRequest: SignUpRequest): SignUpResponse {
        return try {
                client.post {
                    url(HttpRoutes.SIGNUP)
                    contentType(ContentType.Application.Json)
                    body = signUpRequest
                }

        } catch (e: Exception) {
            Log.e("error in SignUp", e.message.toString())
            throw e
        }
    }

    override suspend fun signInUser(signInRequest: SignInRequest): SignInResponse {
        return try {
            client.post {
                url(HttpRoutes.SIGNIN)
                contentType(ContentType.Application.Json)
                body = signInRequest
            }

        } catch (e: Exception) {
            Log.e("error in SignIn", e.message.toString())
            throw e
        }
    }
}