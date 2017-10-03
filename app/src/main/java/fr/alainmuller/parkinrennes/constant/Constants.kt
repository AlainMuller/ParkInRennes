package fr.alainmuller.parkinrennes.constant

/**
 * Created by Alain Muller on 03/10/2017.
 */

interface Constants {

  companion object {
    const val APP_ID = "fr.alainmuller.parkinrennes"
    const val AUTHOR = "parkinrennes@alainmuller.fr"
  }

  interface Citedia {
    // http://www.data.rennes-metropole.fr/espace-developpeurs/api-parking/
    companion object {
      const val CITEDIA_BASE_URL: String = "http://data.citedia.com/r1/"
      const val CITEDIA_PATH_PARKS: String = CITEDIA_BASE_URL + "parks/"
    }
  }
}