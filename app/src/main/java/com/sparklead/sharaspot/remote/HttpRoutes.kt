package com.sparklead.sharaspot.remote

import com.sparklead.sharaspot.BuildConfig

object HttpRoutes {

    private val BASEURL = BuildConfig.BASE_URL

    val SIGNUP = "$BASEURL/signUp"

    val updateUser = "$BASEURL/user"

    val SIGNIN = "$BASEURL/signIn"

    val STATION_LIST = "$BASEURL/chargingStation/allList"
}