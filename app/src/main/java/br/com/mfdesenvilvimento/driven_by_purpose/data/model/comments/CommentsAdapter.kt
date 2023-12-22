package br.com.mfdesenvilvimento.driven_by_purpose.data.model.comments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import br.com.mfdesenvilvimento.driven_by_purpose.R
import br.com.mfdesenvilvimento.driven_by_purpose.databinding.FragmentUserListBinding
import br.com.mfdesenvilvimento.driven_by_purpose.domain.model.Comments

class CommentAdapter: ListAdapter<Comments, CommentAdapter.ViewHolder>(DIFF_CALLBACK) {

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Comments>() {

            override fun areItemsTheSame(oldItem: Comments, newItem: Comments): Boolean {
              return oldItem.name == newItem.name
            }

            override fun areContentsTheSame(oldItem: Comments, newItem: Comments): Boolean {
              return oldItem == newItem
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            FragmentUserListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val comments = getItem(position)

        val nameView = holder.binding.constraintLayout.findViewById<TextView>(R.id.nameView)

        nameView.text = comments.name

        nameView.visibility = View.VISIBLE
    }

    inner class ViewHolder(val binding: FragmentUserListBinding) :
        RecyclerView.ViewHolder(binding.root)

}
