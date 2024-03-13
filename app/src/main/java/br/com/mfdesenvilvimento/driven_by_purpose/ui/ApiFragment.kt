package br.com.mfdesenvilvimento.driven_by_purpose.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import br.com.mfdesenvilvimento.driven_by_purpose.data.model.comments.CommentAdapter
import br.com.mfdesenvilvimento.driven_by_purpose.data.model.comments.VerticalSpaceItemDecoration
import br.com.mfdesenvilvimento.driven_by_purpose.databinding.FragmentApiBinding


class ApiFragment : Fragment() {

    private val viewModel: ListViewModel by viewModels()

    private var _binding: FragmentApiBinding? = null
    private val binding get() = _binding !!

    private lateinit var commentsAdapter: CommentAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentApiBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecycler()
        initObservers()

    }

    private fun initObservers() {
        viewModel.currentCommmentList.observe(viewLifecycleOwner) { comments ->
            commentsAdapter.submitList(comments)
        }
    }

    private fun initRecycler() {
//        addressAdapter = AddressAdapter()

        val verticalSpaceItemDecoration = VerticalSpaceItemDecoration(
            verticalSpaceHeight = 8, // Margem entre os itens
            firstItemTopMargin = 16, // Margem top para o primeiro item
            lastItemBottomMargin = 16 // Margem bottom para o último item
        )

        with(binding.recyclerComment) {
            adapter = CommentAdapter()
            addItemDecoration(verticalSpaceItemDecoration)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}