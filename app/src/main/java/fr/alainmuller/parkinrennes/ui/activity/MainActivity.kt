package fr.alainmuller.parkinrennes.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import fr.alainmuller.parkinrennes.R
import fr.alainmuller.parkinrennes.R.layout
import fr.alainmuller.parkinrennes.ui.widget.adapter.ParkingListAdapter
import org.jetbrains.anko.find

/**
 * Created by Alain Muller on 03/10/2017.
 */
class MainActivity : AppCompatActivity() {

  private val items = listOf<String>(
      "Arsenal - 200",
      "C.Cial Kennedy - 36",
      "Charles de Gaulle - 89",
      "Chézy Dinan - 97",
      "Colombier - 411",
      "Henri Fréville - 101"
  )

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_main)
    val recyclerView: RecyclerView = find(R.id.main_recyclerview)
    recyclerView.layoutManager = LinearLayoutManager(this)
    recyclerView.adapter = ParkingListAdapter(items)
  }
}
