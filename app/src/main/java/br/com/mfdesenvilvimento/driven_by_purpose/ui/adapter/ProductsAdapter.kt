package br.com.mfdesenvilvimento.driven_by_purpose.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import br.com.mfdesenvilvimento.driven_by_purpose.databinding.ItemCardBinding
import br.com.mfdesenvilvimento.driven_by_purpose.domain.model.ProductsModel
import coil.load

class ProductsAdapter: RecyclerView.Adapter<ProductsAdapter.myViewHolder>() {
    inner class myViewHolder(val binding: ItemCardBinding):RecyclerView.ViewHolder(binding.root)

    private val differCallback = object : DiffUtil.ItemCallback<ProductsModel>(){
        override fun areItemsTheSame(oldItem: ProductsModel, newItem: ProductsModel): Boolean = oldItem.categoria = newItem.categoria
        override fun areContentsTheSame(oldItem: ProductsModel, newItem: ProductsModel): Boolean = oldItem ==newItem
    }

    private val differ = AsyncListDiffer(this,differCallback)

    fun submitList(list: List<ProductsModel>) = differ.submitList(list)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder = myViewHolder(
        ItemCardBinding.inflate(
            LayoutInflater.from(
                parent.context
            ), parent, false
        )
    )
    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        val item = differ.currentList[position]
        holder.binding.apply {
            imageView.load(item.categoria)
            textView.text = item.categoria
        }
    }

    override fun getItemCount(): Int = differ.currentList.size

}