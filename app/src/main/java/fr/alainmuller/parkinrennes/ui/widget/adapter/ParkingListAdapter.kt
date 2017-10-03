package fr.alainmuller.parkinrennes.ui.widget.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import fr.alainmuller.parkinrennes.R
import fr.alainmuller.parkinrennes.domain.model.Park
import fr.alainmuller.parkinrennes.ui.widget.adapter.ParkingListAdapter.ViewHolder

/**
 * Created by Alain Muller on 03/10/2017.
 */
class ParkingListAdapter(val context: Context, val items: List<Park>) : RecyclerView.Adapter<ViewHolder>() {
  override fun getItemCount(): Int = items.size

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val park = items[position]
    holder.textView.text = context.getString(R.string.main_park_infos, park.name, park.status.name, park.free, park.max)
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
      TextView(parent.context))


  class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}
