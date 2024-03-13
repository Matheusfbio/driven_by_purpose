package br.com.mfdesenvilvimento.driven_by_purpose.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import br.com.mfdesenvilvimento.driven_by_purpose.R
import br.com.mfdesenvilvimento.driven_by_purpose.data.dto.Attributes
import br.com.mfdesenvilvimento.driven_by_purpose.databinding.TopNotificationLayoutBinding

abstract class NotificationAdapter(var context: Context, var list: List<Attributes>, var type: String) : RecyclerView.Adapter<NotificationAdapter.NotificationViewHolder>() {
    inner class NotificationViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var binding = TopNotificationLayoutBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationViewHolder {
        return NotificationViewHolder(LayoutInflater.from(context).inflate(R.layout.top_notification_layout,parent,false))
    }

    fun updateData(dataItem:List<Attributes>){
        list = dataItem
        notifyDataSetChanged()
    }
    override fun onBindViewHolder(holder: NotificationViewHolder, position: Int) {
        val item = list[position]
        holder.binding.ProductTextView.text = item.slug

/*      Glide.with(context),
            .load(
                "https://s2.coinmarketcap.com/static/img/coins/64x64/" + item.id + ".png"
            ).thumbnail(Glide.with(context).load(R.drawable.spinner))
            .into(holder.binding.currencyImageView) // Substitua 'imageView' pelo ID ou referência real para o ImageView no seu layout

        Glide.with(context)
            .load(
                "https://s3.coinmarketcap.com/generated/sparklines/web/7d/usd/" + item.id + ".png"
            ).thumbnail(Glide.with(context).load(R.drawable.spinner))
            .into(holder.binding.currencyChartImageView) // Substitua 'imageView' pelo ID ou referência real para o ImageView no seu layout*/


        /*holder.binding.currencyPriceTextView.text =
            "${String.format("$%.02f", item.quotes[0].price)}"

        if (item.quotes!![0].percentChange24h > 0) {
            holder.binding.currencyChangeTextView.setTextColor(context.resources.getColor(R.color.green))
            holder.binding.currencyChangeTextView.text =
                "+ ${String.format("%.02f", item.quotes[0].percentChange24h)} % "


        } else {
            holder.binding.currencyChangeTextView.setTextColor(context.resources.getColor(R.color.red))
            holder.binding.currencyChangeTextView.text =
                "${String.format("%.02f", item.quotes[0].percentChange24h)} % "

        }*/
        /*holder.itemView.setOnClickListener{
            if(type== "home"){
                Navigation.findNavController(it).navigate(
                    HomeFragmentDirections.actionHomeFragmentToDetailsFragment(item)
                )
            }else if (type == "market"){
                Navigation.findNavController(it).navigate(
                    MarketFragmentDirections.actionMarketFragmentToDetailsFragment(item)
                )
            }*/

        }


    override fun getItemCount(): Int {
        return list.size
    }
}

