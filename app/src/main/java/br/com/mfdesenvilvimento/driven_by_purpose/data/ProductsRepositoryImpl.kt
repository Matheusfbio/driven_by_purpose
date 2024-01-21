package br.com.mfdesenvilvimento.driven_by_purpose.data

import br.com.mfdesenvilvimento.driven_by_purpose.data.model.Products
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class ProductsRepositoryImpl(
    private val strapiApiService: StrapiApiService
): ProductsRepository {
    override suspend fun getProducts(): Flow<Result<List<Products>>> {
        return flow {
        val productsFromApi = try {
            strapiApiService.getProducts()

            } catch (e: IOException) {
                e.printStackTrace()
                emit(Result.Error(message = "Error loading products"))
                return@flow
            } catch (e: IOException) {
                e.printStackTrace()
                emit(Result.Error(message = "Error loading products"))
                return@flow
            } catch (e: HttpException) {
                e.printStackTrace()
                emit(Result.Error(message = "Error loading products"))
                return@flow
            }  catch (e: Exception) {
                e.printStackTrace()
                emit(Result.Error(message = "Error loading products"))
                return@flow
            }

            emit(Result.Success(productsFromApi))
            }
    }
}