package br.com.mfdesenvilvimento.driven_by_purpose.core.systematicTheology


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import br.com.mfdesenvilvimento.driven_by_purpose.R
import br.com.mfdesenvilvimento.driven_by_purpose.databinding.FragmentToastSnakeBinding

class SystematicTheologyFragment : Fragment(R.layout.fragment_toast_snake) {

    private lateinit var binding: FragmentToastSnakeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentToastSnakeBinding.bind(view)

    }
}