package com.sparklead.sharaspot.ui.repositories

import com.sparklead.sharaspot.models.SignInResponse
import kotlinx.coroutines.flow.Flow

interface SignInRepository {

    fun signInUser(email : String,password : String) : Flow<SignInResponse>

}