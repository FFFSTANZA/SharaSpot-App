package com.sparklead.sharaspot.models

import kotlinx.serialization.Serializable

@Serializable
data class SignUpRequest(

    var firstName: String,

    var lastName: String,

    var email: String,

    var password: String
)