package br.com.mfdesenvilvimento.driven_by_purpose.di

import br.com.mfdesenvilvimento.driven_by_purpose.network.ServiceProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {
    @Provides
    fun providesServiceProvider() = ServiceProvider
}