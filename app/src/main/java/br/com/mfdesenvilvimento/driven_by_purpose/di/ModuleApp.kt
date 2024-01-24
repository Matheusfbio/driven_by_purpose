package br.com.mfdesenvilvimento.driven_by_purpose.di

import br.com.mfdesenvilvimento.driven_by_purpose.data.api.StrapiApiService
import br.com.mfdesenvilvimento.driven_by_purpose.data.repository.ProductsRepositoryImpl
import br.com.mfdesenvilvimento.driven_by_purpose.domain.repository.ProductsRepository
import br.com.mfdesenvilvimento.driven_by_purpose.util.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
object ModuleApp {
    @Singleton
    @Provides
    fun providesRetrofit() = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(StrapiApiService::class.java)

    @Singleton
    @Provides
    fun providesRepository(strapiApiService: StrapiApiService): ProductsRepository = ProductsRepositoryImpl(StrapiApiService)
}