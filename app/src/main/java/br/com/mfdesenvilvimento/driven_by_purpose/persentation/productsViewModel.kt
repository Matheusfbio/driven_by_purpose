package br.com.mfdesenvilvimento.driven_by_purpose.persentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.mfdesenvilvimento.driven_by_purpose.data.ProductsRepository
import br.com.mfdesenvilvimento.driven_by_purpose.data.Result
import br.com.mfdesenvilvimento.driven_by_purpose.data.model.Products
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class productsViewModel(
    private val productsRepository: ProductsRepository
) : ViewModel() {
    private val _products = MutableStateFlow<List<Products>>(emptyList())
    val products = _products.asStateFlow()

    private val _showErrorToastChannel = Channel<Boolean>()
    val showErrorToastChannel = _showErrorToastChannel.receiveAsFlow()

    init {
        viewModelScope.launch {
            productsRepository.getProducts().collectLatest { result ->
                when(result) {
                    is Result.Error -> {
                        _showErrorToastChannel.send(true)
                    }
                    is Result.Success -> {
                        result.data?.let { products ->
                            _products.update { products }
                        }
                    }

                    else -> {}
                }
            }
        }
    }
}