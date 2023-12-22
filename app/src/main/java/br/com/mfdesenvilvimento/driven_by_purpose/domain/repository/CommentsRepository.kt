package br.com.mfdesenvilvimento.driven_by_purpose.domain.repository

import br.com.mfdesenvilvimento.driven_by_purpose.data.model.comments.CommentsResponse

interface CommentsRepository {
    suspend fun getComments(name: String): CommentsResponse
}