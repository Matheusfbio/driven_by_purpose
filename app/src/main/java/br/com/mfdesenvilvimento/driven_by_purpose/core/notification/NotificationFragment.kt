package br.com.mfdesenvilvimento.driven_by_purpose.core.notification

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import br.com.mfdesenvilvimento.driven_by_purpose.databinding.FragmentNotificationBinding
import br.com.mfdesenvilvimento.driven_by_purpose.helper.initToolbar
import br.com.mfdesenvilvimento.driven_by_purpose.ui.adapter.ProductsAdapter
import br.com.mfdesenvilvimento.driven_by_purpose.ui.viewmodel.ProductsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NotificationFragment : Fragment() {

    private var _binding: FragmentNotificationBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapterMain: ProductsAdapter
    private lateinit var viewModelMain: ProductsViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNotificationBinding.inflate(inflater,container, false)

        adapterMain = ProductsAdapter()

        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerView.apply {
            adapter = adapterMain
            layoutManager = GridLayoutManager(this@NotificationFragment, 2)
            setHasFixedSize(true)
        }

        lifecycleScope.launchWhenCreated {
            viewModelMain.state.collect{
                when{
                    it.load -> binding.progressBar.visibility =  View.VISIBLE
                    it.success.isNotEmpty() -> {
                        binding.progressBar.visibility = View.GONE
                        adapterMain.submitList(it.success)
                    }
                    it.fail.isNotBlank() -> {
                        binding.progressBar.visibility = View.GONE
                        Toast.makeText(this@NotificationFragment, it.fail, Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }

        initToolbar(binding.btnToolbar)
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}