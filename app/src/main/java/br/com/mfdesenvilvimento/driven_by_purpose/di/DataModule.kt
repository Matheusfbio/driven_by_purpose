package br.com.mfdesenvilvimento.driven_by_purpose.di

import br.com.mfdesenvilvimento.driven_by_purpose.data.api.ServiceApi
import br.com.mfdesenvilvimento.driven_by_purpose.network.ServiceProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class DataModule {

    @Provides
    fun providesServiceApi(
        serviceProvides: ServiceProvider
    ): ServiceApi {
        return serviceProvides.createService(ServiceApi::class.java)
    }
}