package br.com.mfdesenvilvimento.driven_by_purpose

import android.os.Bundle
import android.view.View
import br.com.mfdesenvilvimento.driven_by_purpose.R
import br.com.mfdesenvilvimento.driven_by_purpose.databinding.FragmentMainBinding
import br.com.mfdesenvilvimento.driven_by_purpose.util.navTo

class MainFragment : androidx.fragment.app.Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentMainBinding.bind(view)
        binding.TeologiaSistematica.setOnClickListener { navTo(R.id.toastSnakeFragment) }
    }
}