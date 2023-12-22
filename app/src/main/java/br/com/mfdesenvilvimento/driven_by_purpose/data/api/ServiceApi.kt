package br.com.mfdesenvilvimento.driven_by_purpose.data.api

import br.com.mfdesenvilvimento.driven_by_purpose.data.model.comments.CommentsResponse
import retrofit2.http.GET

interface ServiceApi {
    @GET("comments")
     suspend fun getComments(name: String): CommentsResponse
}