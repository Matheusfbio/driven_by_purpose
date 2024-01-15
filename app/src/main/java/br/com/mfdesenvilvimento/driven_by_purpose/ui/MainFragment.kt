package br.com.mfdesenvilvimento.driven_by_purpose.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import br.com.mfdesenvilvimento.driven_by_purpose.R
import br.com.mfdesenvilvimento.driven_by_purpose.databinding.FragmentSystematicTheologyBinding
import br.com.mfdesenvilvimento.driven_by_purpose.util.navTo

class MainFragment : Fragment(R.layout.fragment_systematic_theology) {

    private lateinit var binding: FragmentSystematicTheologyBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentSystematicTheologyBinding.bind(view)
        binding.btTeologiaSistematica.setOnClickListener { navTo(R.id.notificationFragment) }
    }
}