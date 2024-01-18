package br.com.mfdesenvilvimento.driven_by_purpose.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Suppress("DEPRECATED_ANNOTATION")
@Parcelize
data class StrapiProperty(
    val id: Int,
    val attributes: StrapiAttributes
) : Parcelable

@Suppress("DEPRECATED_ANNOTATION")
@Parcelize
data class StrapiAttributes(
    val slug: String,
    val description: String,
    val title: String,
    val categoria: String,
    val valor: Int,
    @SerializedName("createdAt") val createdAt: String,
    @SerializedName("updatedAt") val updatedAt: String,
    @SerializedName("publishedAt") val publishedAt: String,
    val locale: String
) : Parcelable
