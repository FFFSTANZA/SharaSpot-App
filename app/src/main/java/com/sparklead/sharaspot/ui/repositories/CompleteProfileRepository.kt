package com.sparklead.sharaspot.ui.repositories

import com.sparklead.sharaspot.models.User
import kotlinx.coroutines.flow.Flow

interface CompleteProfileRepository {

    fun updateUser(id : String,user: User) : Flow<String>

}