package br.com.mfdesenvilvimento.driven_by_purpose.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class StrapiApiUtilities {
    companion object {
        fun getInstance(): Retrofit {
            return Retrofit.Builder()
                .baseUrl("http://localhost:1337/api")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}