package br.com.mfdesenvilvimento.driven_by_purpose.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Comments(
    val name: String?,
    val email: String?,
): Parcelable