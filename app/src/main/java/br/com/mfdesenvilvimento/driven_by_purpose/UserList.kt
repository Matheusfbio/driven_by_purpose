package br.com.mfdesenvilvimento.driven_by_purpose

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import br.com.mfdesenvilvimento.driven_by_purpose.data.model.comments.CommentAdapter
import br.com.mfdesenvilvimento.driven_by_purpose.data.model.comments.VerticalSpaceItemDecoration
import br.com.mfdesenvilvimento.driven_by_purpose.databinding.FragmentApiBinding
import br.com.mfdesenvilvimento.driven_by_purpose.databinding.FragmentUserListBinding
import br.com.mfdesenvilvimento.driven_by_purpose.ui.ListViewModel


class UserList : Fragment() {

    private val viewModel: ListViewModel by viewModels()

    private var _binding: FragmentApiBinding? = null
    private val binding get() = _binding!!

    private lateinit var commentAdapter: CommentAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentApiBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecycler()
//
//        initObservers()

//        initListeners()
    }

//    private fun initListeners() {
//        binding.fabAdd.setOnClickListener {
//            findNavController().navigate(R.id.action_listAddressFragment_to_searchAddressFragment)
//        }
//
//        parentFragmentManager.setFragmentResultListener(
//            REQUEST_KEY,
//            this
//        ) { _, bundle ->
//            val address = bundle.getParcelableCompat(ADDRESS_BUNDLE_KEY, Address::class.java)
//            if (address != null) {
//                viewModel.insertAddress(address)
//            }
//        }
//    }

//    private fun initObservers() {
//        viewModel.currentCommmentList.observe(viewLifecycleOwner) { Comments ->
//            addressAdapter.submitList(addresses)
//        }
//    }

    private fun initRecycler() {
        commentAdapter = CommentAdapter()

        val verticalSpaceItemDecoration = VerticalSpaceItemDecoration(
            verticalSpaceHeight = 8, // Margem entre os itens
            firstItemTopMargin = 16, // Margem top para o primeiro item
            lastItemBottomMargin = 16 // Margem bottom para o último item
        )

        with(binding.recyclerComment) {
            adapter = commentAdapter
            addItemDecoration(verticalSpaceItemDecoration)
        }
    }

        override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}