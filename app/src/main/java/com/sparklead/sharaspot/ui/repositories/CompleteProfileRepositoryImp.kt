package com.sparklead.sharaspot.ui.repositories

import com.sparklead.sharaspot.models.User
import com.sparklead.sharaspot.service.UserService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class CompleteProfileRepositoryImp @Inject constructor(private val service: UserService) : CompleteProfileRepository {

    override fun updateUser(id: String, user: User): Flow<String> {
        return flow {
          emit(service.updateUser(id,user))
        }
    }

}