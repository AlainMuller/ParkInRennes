package fr.alainmuller.parkinrennes.network

import android.util.Log
import com.google.gson.Gson
import fr.alainmuller.parkinrennes.data.ParkResponse
import java.net.URL

/**
 * Created by Alain Muller on 03/10/2017.
 */
class ParkRequest {

  fun execute(): ParkResponse {
    val parkingJsonStr = URL(fr.alainmuller.parkinrennes.constant.Constants.Citedia.CITEDIA_PATH_PARKS).readText()
    Log.d(javaClass.simpleName, parkingJsonStr)
    return Gson().fromJson(parkingJsonStr, ParkResponse::class.java)
  }
}