package br.com.mfdesenvilvimento.driven_by_purpose.ui.screens

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException


sealed interface productsUiState {
    data class Success(val photos: String) : productsUiState
    object Error : productsUiState
    object Loading : productsUiState
}
class ProductsViewModel {

    var productsUiState: productsUiState by mutableStateOf(productsUiState.Loading)
        private set

    /**
     * Call getMarsPhotos() on init so we can display status immediately.
     */
    init {
        getMarsPhotos()
    }

    /**
     * Gets Mars photos information from the Mars API Retrofit service and updates the
     * [MarsPhoto] [List] [MutableList].
     */
    fun getMarsPhotos() {
        viewmodel.launch {
            productsUiState = productsUiState.Loading
            productsUiState = try {
                val listResult = MarsApi.retrofitService.getPhotos()
                productsUiState.Success(
                    "Success: ${listResult.size} Mars photos retrieved"
                )
            } catch (e: IOException) {
                productsUiState.Error
            } catch (e: HttpException) {
                productsUiState.Error
            }
        }
    }
}