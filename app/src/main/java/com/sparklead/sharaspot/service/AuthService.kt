package com.sparklead.sharaspot.service

import com.sparklead.sharaspot.models.SignInRequest
import com.sparklead.sharaspot.models.SignInResponse
import com.sparklead.sharaspot.models.SignUpRequest
import com.sparklead.sharaspot.models.SignUpResponse

interface AuthService {

    suspend fun signUpUser(signUpRequest: SignUpRequest): SignUpResponse

    suspend fun signInUser(signInRequest: SignInRequest): SignInResponse
}