package fr.alainmuller.parkinrennes.domain.model

import fr.alainmuller.parkinrennes.data.ParkStatus

/**
 * Created by Alain Muller on 03/10/2017.
 */
data class Park(val id: String, val name: String, val status: ParkStatus, val max: Int, val free: Int)