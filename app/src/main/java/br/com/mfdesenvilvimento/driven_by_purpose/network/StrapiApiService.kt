package br.com.mfdesenvilvimento.driven_by_purpose.network

import br.com.mfdesenvilvimento.driven_by_purpose.data.dto.ProductsProperty
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.http.GET

private const val BASE_URL =
    "http://localhost:1337/api"

/**
 * Use the Retrofit builder to build a retrofit object using a kotlinx.serialization converter
 */
private val retrofit = Retrofit.Builder()
    .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
    .baseUrl(BASE_URL)
    .build()

/**
 * Retrofit service object for creating api calls
 */
interface StrapiApiService {
    @GET("products")
    suspend fun getPhotos(): List<ProductsProperty>
}

/**
 * A public Api object that exposes the lazy-initialized Retrofit service
 */
object StrapiApi {
    val retrofitService: StrapiApiService by lazy {
        retrofit.create(StrapiApiService::class.java)
    }
}

