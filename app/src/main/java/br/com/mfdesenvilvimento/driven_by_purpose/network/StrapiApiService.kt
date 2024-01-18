package br.com.mfdesenvilvimento.driven_by_purpose.network

import br.com.mfdesenvilvimento.driven_by_purpose.model.StrapiProperty
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.http.GET



private const val BASE_URL = "http://localhost:1337/api"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
    .baseUrl(BASE_URL)
    .build()
interface StrapiApiService {
    @GET("products")
    suspend fun getItems(): List<StrapiProperty>


    object ProductsApi {
        val retrofitService : StrapiApiService by lazy { retrofit.create(StrapiApiService::class.java) }
    }
}
