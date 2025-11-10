package com.sparklead.sharaspot.ui.states

import com.sparklead.sharaspot.models.User

sealed class SignInUiState {

    object Empty : SignInUiState()

    object Loading : SignInUiState()

    data class Success(val user : User) : SignInUiState()

    data class Error(val message : String) : SignInUiState()
}