package br.com.mfdesenvilvimento.driven_by_purpose.data

import br.com.mfdesenvilvimento.driven_by_purpose.data.model.Products
import kotlinx.coroutines.flow.Flow

interface ProductsRepository {
    suspend fun getProducts(): Flow<Result<List<Products>>>
}