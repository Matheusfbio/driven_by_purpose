package br.com.mfdesenvilvimento.driven_by_purpose.data.api

import br.com.mfdesenvilvimento.driven_by_purpose.data.dto.ProductModel
import retrofit2.Response

import retrofit2.http.GET

interface StrapiApi {
    @GET("products")
    suspend fun getProducts(): Response<ProductModel>
}

