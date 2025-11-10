package com.sparklead.sharaspot.ui.repositories

import com.sparklead.sharaspot.models.SignInRequest
import com.sparklead.sharaspot.models.SignInResponse
import com.sparklead.sharaspot.service.AuthService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class SignInRepositoryImp @Inject constructor (private val service: AuthService): SignInRepository {

    override fun signInUser(email: String, password: String): Flow<SignInResponse> {
        return flow {
            emit(service.signInUser(SignInRequest(email, password)))
        }
    }
}