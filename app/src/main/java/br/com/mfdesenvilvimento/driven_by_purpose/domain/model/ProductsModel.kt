package br.com.mfdesenvilvimento.driven_by_purpose.domain.model

import br.com.mfdesenvilvimento.driven_by_purpose.data.dto.Attributes

data class ProductsModel(
    val categoria: String,
    val createdAt: String,
    val description: String,
    val locale: String,
    val publishedAt: String,
    val slug: String,
    val title: String,
    val updatedAt: String,
    val valor: Int
)

fun Attributes.toDomain() = ProductsModel(
    categoria, createdAt, description, locale, publishedAt, slug, title, updatedAt, valor
)