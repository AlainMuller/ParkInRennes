package fr.alainmuller.parkinrennes.domain.commands

/**
 * Created by Alain Muller on 03/10/2017.
 */
interface Command<out T> {
  fun execute(): T
}