package br.com.mfdesenvilvimento.driven_by_purpose

import android.os.Bundle
import android.view.View
import br.com.mfdesenvilvimento.driven_by_purpose.databinding.FragmentSystematicTheologyBinding
import br.com.mfdesenvilvimento.driven_by_purpose.util.navTo

class MainFragment : androidx.fragment.app.Fragment(R.layout.fragment_systematic_theology) {

    private lateinit var binding: FragmentSystematicTheologyBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentSystematicTheologyBinding.bind(view)
        binding.btTeologiaSistematica.setOnClickListener { navTo(R.id.toastSnakeFragment) }
        binding.btNotification.setOnClickListener { navTo(R.id.notificationFragment) }
    }
}