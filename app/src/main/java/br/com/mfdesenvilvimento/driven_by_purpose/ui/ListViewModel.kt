package br.com.mfdesenvilvimento.driven_by_purpose.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.mfdesenvilvimento.driven_by_purpose.domain.model.Comments
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor() :  ViewModel() {
    private val _commentsList = MutableLiveData<MutableList<Comments>>()
    val currentCommmentList: LiveData<MutableList<Comments>> = _commentsList

}