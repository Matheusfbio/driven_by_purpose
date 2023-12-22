package br.com.mfdesenvilvimento.driven_by_purpose.data.model.comments

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CommentsResponse (
    val name: String?,
    val email: String?,
): Parcelable