package br.com.mfdesenvilvimento.driven_by_purpose.data.model.comments

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import br.com.mfdesenvilvimento.driven_by_purpose.domain.model.Comments
import br.com.mfdesenvilvimento.driven_by_purpose.domain.usecase.GetNameUseCase
import br.com.mfdesenvilvimento.driven_by_purpose.util.StateView
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import retrofit2.HttpException
import javax.inject.Inject

@HiltViewModel
class CommentsViewtModel @Inject constructor(
    private val getCommentsUseCase: GetNameUseCase
) : ViewModel() {

fun getComments(name: String) = liveData<StateView<Comments>>(Dispatchers.IO) {
    try {
        emit(StateView.Loading())

        val comments = getCommentsUseCase(name)
    }catch (e: HttpException) {
        e.printStackTrace()
        emit(StateView.Error(message = e.message))
    } catch (e: Exception) {
        e.printStackTrace()
        emit(StateView.Error(message = e.message))
        }
    }

}