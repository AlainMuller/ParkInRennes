package fr.alainmuller.parkinrennes.ui.widget.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView
import fr.alainmuller.parkinrennes.ui.widget.adapter.ParkingListAdapter.ViewHolder

/**
 * Created by Alain Muller on 03/10/2017.
 */
class ParkingListAdapter(val items: List<String>) : RecyclerView.Adapter<ViewHolder>() {
  override fun getItemCount(): Int = items.size

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.textView.text = items[position]
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
      TextView(parent.context))


  class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}
