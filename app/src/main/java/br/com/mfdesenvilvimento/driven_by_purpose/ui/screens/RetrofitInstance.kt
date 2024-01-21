package br.com.mfdesenvilvimento.driven_by_purpose.ui.screens

import br.com.mfdesenvilvimento.driven_by_purpose.data.StrapiApiService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val interceptor: HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        level =  HttpLoggingInterceptor.Level.BODY
    }

    private val client: OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(interceptor)
        .build()

    val api: StrapiApiService = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(StrapiApiService.BASE_URL)
        .client(client)
        .build()
        .create(StrapiApiService::class.java)
}