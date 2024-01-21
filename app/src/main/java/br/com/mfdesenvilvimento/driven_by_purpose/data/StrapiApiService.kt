package br.com.mfdesenvilvimento.driven_by_purpose.data

import br.com.mfdesenvilvimento.driven_by_purpose.data.model.Products
import retrofit2.http.GET



//
//private val retrofit = Retrofit.Builder()
//    .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
//    .baseUrl(BASE_URL)
//    .build()
interface StrapiApiService {
    @GET("products")
    suspend fun getProducts(): List<Products>

    companion object {
        const val BASE_URL = "http://localhost:1337/api"
    }

//    object ProductsApi {
//        val retrofitService : StrapiApiService by lazy { retrofit.create(StrapiApiService::class.java) }
//    }
}
