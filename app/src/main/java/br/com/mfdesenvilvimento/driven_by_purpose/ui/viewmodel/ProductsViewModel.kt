package br.com.mfdesenvilvimento.driven_by_purpose.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.mfdesenvilvimento.driven_by_purpose.domain.usecase.ProductsUseCase
import br.com.mfdesenvilvimento.driven_by_purpose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(private val useCase: ProductsUseCase):ViewModel() {
    private val _state = MutableStateFlow(ProductsStates())
    val state: MutableStateFlow<ProductsStates> = _state

    init {
        getItem()
    }

    private fun getItem() = viewModelScope.launch(Dispatchers.IO) {
        useCase().collect{
            when(it){
                is Resource.Sucess-> _state.value =  ProductsStates(success = it.data ?: emptyList())
                is Resource.Loading-> _state.value =  ProductsStates(load = true)
                is Resource.Error-> _state.value =  ProductsStates(fail = it.message ?: "error")
            }
        }
    }

}