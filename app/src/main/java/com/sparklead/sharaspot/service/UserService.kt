package com.sparklead.sharaspot.service

import com.sparklead.sharaspot.models.User

interface UserService {

    suspend fun updateUser(id: String, user: User): String

}