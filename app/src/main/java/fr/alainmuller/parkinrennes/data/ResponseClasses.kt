package fr.alainmuller.parkinrennes.data

/**
 * Created by Alain Muller on 03/10/2017.
 */
data class ParkResponse(val parks: List<Park>)

data class Park(val id: String, val parkInformation: ParkInformation?)

data class ParkInformation(val name: String, val status: ParkStatus, val max: Int, val free: Int)

enum class ParkStatus {
  AVAILABLE,
  FULL,
  CLOSED
}
