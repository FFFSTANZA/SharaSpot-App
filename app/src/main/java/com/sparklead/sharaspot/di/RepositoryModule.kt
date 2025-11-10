package com.sparklead.sharaspot.di

import com.sparklead.sharaspot.service.AuthService
import com.sparklead.sharaspot.service.ChargingStationService
import com.sparklead.sharaspot.service.UserService
import com.sparklead.sharaspot.ui.repositories.ChargingStationRepository
import com.sparklead.sharaspot.ui.repositories.ChargingStationRepositoryImp
import com.sparklead.sharaspot.ui.repositories.CompleteProfileRepository
import com.sparklead.sharaspot.ui.repositories.CompleteProfileRepositoryImp
import com.sparklead.sharaspot.ui.repositories.SignInRepository
import com.sparklead.sharaspot.ui.repositories.SignInRepositoryImp
import com.sparklead.sharaspot.ui.repositories.SignUpRepository
import com.sparklead.sharaspot.ui.repositories.SignUpRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object RepositoryModule {

    @Provides
    fun providesSignUpRepository(service: AuthService): SignUpRepository =
        SignUpRepositoryImp(service)

    @Provides
    fun providesCompleteProfileRepository(service: UserService): CompleteProfileRepository =
        CompleteProfileRepositoryImp(service)

    @Provides
    fun providesSignInRepository(service: AuthService): SignInRepository =
        SignInRepositoryImp(service)

    @Provides
    fun providesChargingStationRepository(service: ChargingStationService): ChargingStationRepository =
        ChargingStationRepositoryImp(service)
}