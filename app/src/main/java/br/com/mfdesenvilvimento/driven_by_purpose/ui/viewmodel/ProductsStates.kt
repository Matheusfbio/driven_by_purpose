package br.com.mfdesenvilvimento.driven_by_purpose.ui.viewmodel

import br.com.mfdesenvilvimento.driven_by_purpose.domain.model.ProductsModel

data class ProductsStates(
    val load:Boolean = false,
    val success: List<ProductsModel> = emptyList(),
    val fail:String = ""
)
