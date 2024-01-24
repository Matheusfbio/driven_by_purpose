package br.com.mfdesenvilvimento.driven_by_purpose.domain.usecase

import br.com.mfdesenvilvimento.driven_by_purpose.domain.model.ProductsModel
import br.com.mfdesenvilvimento.driven_by_purpose.domain.model.toDomain
import br.com.mfdesenvilvimento.driven_by_purpose.domain.repository.ProductsRepository
import br.com.mfdesenvilvimento.driven_by_purpose.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class ProductsUseCase @Inject constructor(private val repository: ProductsRepository) {
    suspend operator fun invoke(): Flow<Resource<List<ProductsModel>>> = flow {
        try {
            emit(Resource.Loading())
            val data = repository.getProducts().attributes.map { it.toDomain() }
            emit(Resource.Sucess(data))
        } catch (e:HttpException){
            emit(Resource.Error(e.localizedMessage ?: "no internet connection"))
        }catch (e:IOException){
            emit(Resource.Error("Error"))
        }
    }
}