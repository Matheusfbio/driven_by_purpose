package br.com.mfdesenvilvimento.driven_by_purpose.data.api

import br.com.mfdesenvilvimento.driven_by_purpose.data.dto.Products
import br.com.mfdesenvilvimento.driven_by_purpose.util.Constants

import retrofit2.http.GET

interface StrapiApiService {
    @GET(Constants.END_POINT)
    suspend fun getProducts(): Products

}
