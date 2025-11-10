package com.sparklead.sharaspot.models

import kotlinx.serialization.Serializable

@Serializable
data class SignInResponse(

    var user: User
)