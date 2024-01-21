package br.com.mfdesenvilvimento.driven_by_purpose.core.notification

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.mfdesenvilvimento.driven_by_purpose.R
import br.com.mfdesenvilvimento.driven_by_purpose.databinding.FragmentNotificationBinding
import br.com.mfdesenvilvimento.driven_by_purpose.helper.initToolbar
import br.com.mfdesenvilvimento.driven_by_purpose.persentation.productsViewModel


class NotificationFragment : Fragment(R.layout.fragment_notification) {

    private var _binding: FragmentNotificationBinding? = null
    private val binding get() = _binding!!

    private val viewModel: productsViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNotificationBinding.inflate(inflater,container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initToolbar(binding.btnToolbar)
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}