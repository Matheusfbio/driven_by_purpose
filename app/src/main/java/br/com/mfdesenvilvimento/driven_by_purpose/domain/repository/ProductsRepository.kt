package br.com.mfdesenvilvimento.driven_by_purpose.domain.repository

import br.com.mfdesenvilvimento.driven_by_purpose.data.dto.ProductsProperty

interface ProductsRepository {
    suspend fun getProducts(): List<ProductsProperty>
}