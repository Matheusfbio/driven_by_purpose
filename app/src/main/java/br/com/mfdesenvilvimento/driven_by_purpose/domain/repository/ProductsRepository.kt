package br.com.mfdesenvilvimento.driven_by_purpose.domain.repository

import br.com.mfdesenvilvimento.driven_by_purpose.data.dto.Products

interface ProductsRepository {
    suspend fun getProducts(): Products
}