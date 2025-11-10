package com.sparklead.sharaspot.ui.repositories

import com.sparklead.sharaspot.models.SignUpRequest
import com.sparklead.sharaspot.models.SignUpResponse
import com.sparklead.sharaspot.service.AuthService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class SignUpRepositoryImp @Inject constructor(private val service: AuthService) : SignUpRepository {

    override fun signUser(firstName: String, lastName: String, email: String, password: String): Flow<SignUpResponse> {
        return flow {
            emit(service.signUpUser(SignUpRequest(firstName,lastName, email, password)))
        }
    }
}