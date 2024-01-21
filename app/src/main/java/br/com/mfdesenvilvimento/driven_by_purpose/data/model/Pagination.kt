package br.com.mfdesenvilvimento.driven_by_purpose.data.model

data class Pagination(
    val page: Int,
    val pageCount: Int,
    val pageSize: Int,
    val total: Int
)