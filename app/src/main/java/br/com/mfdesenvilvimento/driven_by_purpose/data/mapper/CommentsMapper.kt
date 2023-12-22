package br.com.mfdesenvilvimento.driven_by_purpose.data.mapper

import br.com.mfdesenvilvimento.driven_by_purpose.data.model.comments.CommentsResponse
import br.com.mfdesenvilvimento.driven_by_purpose.domain.model.Comments

fun CommentsResponse.toDomain(): Comments {
    return Comments(
        name = name,
        email =  email
    )
}
