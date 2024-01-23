package br.com.mfdesenvilvimento.driven_by_purpose.data.repository

import br.com.mfdesenvilvimento.driven_by_purpose.data.api.StrapiApiService
import br.com.mfdesenvilvimento.driven_by_purpose.domain.repository.ProductsRepository
import javax.inject.Inject

class ProductsRepositoryImpl @Inject constructor(private val strapiApiService: StrapiApiService):
    ProductsRepository {
    override suspend fun getProducts(): Products = strapiApiService.getProducts()
}