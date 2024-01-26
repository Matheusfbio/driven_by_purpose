package br.com.mfdesenvilvimento.driven_by_purpose.core.notification

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import br.com.mfdesenvilvimento.driven_by_purpose.adapter.TopNotificationAdapter
import br.com.mfdesenvilvimento.driven_by_purpose.data.api.StrapiApi
import br.com.mfdesenvilvimento.driven_by_purpose.data.api.StrapiApiUtilities
import br.com.mfdesenvilvimento.driven_by_purpose.data.dto.Attributes
import br.com.mfdesenvilvimento.driven_by_purpose.databinding.FragmentNotificationBinding
import br.com.mfdesenvilvimento.driven_by_purpose.helper.initToolbar
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class NotificationFragment : Fragment() {

    private var _binding: FragmentNotificationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentNotificationBinding.inflate(inflater,container, false)

        getTopCurrencyList()

        return binding.root
    }
    override  fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initToolbar(binding.btnToolbar)
  }

    private fun getTopCurrencyList() {
        lifecycleScope.launch(Dispatchers.IO) {
            val res = StrapiApiUtilities.getInstance().create(StrapiApi::class.java).getProducts()
            withContext(Dispatchers.Main){
                binding.topRecyclerView.adapter = TopNotificationAdapter(requireContext(),res.body()!!.data.toString())

            }

            Log.d("SHUBH","getTopCurrencyList: ${res.body()!!.data.toString()}")
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}