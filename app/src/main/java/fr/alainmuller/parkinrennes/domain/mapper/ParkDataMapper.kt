package fr.alainmuller.parkinrennes.domain.mapper

import fr.alainmuller.parkinrennes.data.Park
import fr.alainmuller.parkinrennes.data.ParkResponse
import fr.alainmuller.parkinrennes.domain.model.Park as ModelPark

/**
 * Created by Alain Muller on 03/10/2017.
 */
class ParkDataMapper {
  fun convertFromDataModel(parkResponse: ParkResponse): List<ModelPark> = parkResponse.parks.filter { park -> park.parkInformation != null }
      .map { park -> convertParkItemToDomain(park) }

  private fun convertParkItemToDomain(park: Park): ModelPark = ModelPark(park.id, park.parkInformation!!.name, park.parkInformation.status,
      park.parkInformation.max, park.parkInformation.free)

}