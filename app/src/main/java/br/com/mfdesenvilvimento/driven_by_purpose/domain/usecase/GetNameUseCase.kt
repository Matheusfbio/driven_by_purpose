package br.com.mfdesenvilvimento.driven_by_purpose.domain.usecase

import br.com.mfdesenvilvimento.driven_by_purpose.data.mapper.toDomain
import br.com.mfdesenvilvimento.driven_by_purpose.domain.model.Comments
import br.com.mfdesenvilvimento.driven_by_purpose.domain.repository.CommentsRepository
import javax.inject.Inject

class GetNameUseCase @Inject constructor(
    private val repository: CommentsRepository
) {

    suspend operator fun invoke(name: String): Comments {
        return repository.getComments(name).toDomain()
    }
}