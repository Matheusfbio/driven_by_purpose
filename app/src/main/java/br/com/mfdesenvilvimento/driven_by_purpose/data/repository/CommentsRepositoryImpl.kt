package br.com.mfdesenvilvimento.driven_by_purpose.data.repository

import br.com.mfdesenvilvimento.driven_by_purpose.data.api.ServiceApi
import br.com.mfdesenvilvimento.driven_by_purpose.data.model.comments.CommentsResponse
import br.com.mfdesenvilvimento.driven_by_purpose.domain.repository.CommentsRepository
import javax.inject.Inject

class CommentsRepositoryImpl  @Inject constructor(
    private val serviceApi: ServiceApi): CommentsRepository {
    override suspend fun getComments(name: String): CommentsResponse {
        return serviceApi.getComments(name)
    }
}