package fr.alainmuller.parkinrennes.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import fr.alainmuller.parkinrennes.R
import fr.alainmuller.parkinrennes.R.layout
import fr.alainmuller.parkinrennes.domain.commands.RequestParkCommand
import fr.alainmuller.parkinrennes.ui.widget.adapter.ParkingListAdapter
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.find
import org.jetbrains.anko.longToast
import org.jetbrains.anko.uiThread

/**
 * Created by Alain Muller on 03/10/2017.
 */
class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(layout.activity_main)
    val recyclerView: RecyclerView = find(R.id.main_recyclerview)
    recyclerView.layoutManager = LinearLayoutManager(this)

    doAsync {
      val result = RequestParkCommand().execute()
      uiThread {
        longToast("ParkRequest performed")
        recyclerView.adapter = ParkingListAdapter(it, result)
      }
    }
  }
}
