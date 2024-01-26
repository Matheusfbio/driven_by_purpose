package br.com.mfdesenvilvimento.driven_by_purpose.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.mfdesenvilvimento.driven_by_purpose.R
import br.com.mfdesenvilvimento.driven_by_purpose.databinding.TopNotificationLayoutBinding

class TopNotificationAdapter(var context: Context, val list: String): RecyclerView.Adapter<TopNotificationAdapter.TopNotificationViewHolder>() {
    inner class TopNotificationViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var binding = TopNotificationLayoutBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopNotificationViewHolder {
        return TopNotificationViewHolder(LayoutInflater.from(context).inflate(R.layout.top_notification_layout,parent,false))
    }


    override fun onBindViewHolder(holder: TopNotificationViewHolder, position: Int) {
        val item = list[position]

        holder.binding.ProductTextView.text = item.slug
//        Glide.with(context)
//            .load(
//                "https://s2.coinmarketcap.com/static/img/coins/64x64/" + item.id + ".png"
//            ).thumbnail(Glide.with(context).load(R.drawable.spinner))
//            .into(holder.binding.topCurrencyImageView) // Substitua 'imageView' pelo ID ou referência real para o ImageView no seu layout

//
//        if (item.quotes!![0].percentChange24h > 0) {
//            holder.binding.topCurrencyChangeTextView.setTextColor(context.resources.getColor(R.color.green))
//            holder.binding.topCurrencyChangeTextView.text =
//                "+ ${String.format("%.02f", item.quotes[0].percentChange24h)} % "
//
//
//        } else {
//            holder.binding.topCurrencyChangeTextView.setTextColor(context.resources.getColor(R.color.red))
//            holder.binding.topCurrencyChangeTextView.text =
//                "${String.format("%.02f", item.quotes[0].percentChange24h)} % "
//        }
//        Log.d(
//            "TopmatketAdapter",
//            "Item Name: ${item.name}, Percent Change: ${item.quotes!![0].percentChange24h}"
//        )
    }

    override fun getItemCount(): Int {
        return list.size
    }
}