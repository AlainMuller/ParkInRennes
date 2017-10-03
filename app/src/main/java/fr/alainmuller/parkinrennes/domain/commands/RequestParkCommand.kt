package fr.alainmuller.parkinrennes.domain.commands

import fr.alainmuller.parkinrennes.domain.mapper.ParkDataMapper
import fr.alainmuller.parkinrennes.domain.model.Park
import fr.alainmuller.parkinrennes.network.ParkRequest

/**
 * Created by Alain Muller on 04/10/2017.
 */
class RequestParkCommand : Command<List<Park>> {
  override fun execute(): List<Park> {
    return ParkDataMapper().convertFromDataModel(ParkRequest().execute())
  }
}