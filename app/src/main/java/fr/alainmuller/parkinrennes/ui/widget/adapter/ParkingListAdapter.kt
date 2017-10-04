package fr.alainmuller.parkinrennes.ui.widget.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import fr.alainmuller.parkinrennes.R
import fr.alainmuller.parkinrennes.domain.model.Park
import fr.alainmuller.parkinrennes.ui.widget.adapter.ParkingListAdapter.ViewHolder

/**
 * Created by Alain Muller on 03/10/2017.
 */
class ParkingListAdapter(context: Context, val items: List<Park> = listOf<Park>()) : RecyclerView.Adapter<ViewHolder>() {

  private val inflater: LayoutInflater = LayoutInflater.from(context)

  override fun getItemCount(): Int = items.size

  override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    holder.bind(items[position])
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
    return ViewHolder(inflater.inflate(R.layout.park_list_item, parent, false))
  }

  class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var parkingNameView: TextView = itemView.findViewById(R.id.park_name)
    var parkingStatusView: TextView = itemView.findViewById(R.id.park_status)
    var parkingPlacesView: TextView = itemView.findViewById(R.id.park_places)

    fun bind(park: Park) {
      parkingNameView.text = park.name
      parkingStatusView.text = park.status.name
      parkingPlacesView.text = "${park.free}/${park.max}"
    }
  }
}
