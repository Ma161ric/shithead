package src.main.scala.htwg
package controller

import model._
import util.Observable

case class Controller(var game: Game) extends Observable:
    def add(p: String, karte: String): Int =
        val err = game.add(p, karte)
        notifyObservers
        return err

    def take(player: String): Int =
        val err = game.take(player)
        notifyObservers
        return err


    def place(player: String, ind: Int): Int = //Index auf outofbounds checken
        val err = game.place(player, ind)
        notifyObservers
        return err

    def newG(p1: String, p2: String, p3: String, p4: String) : Game =
        val err = new Game(p1, p2, p3, p4)
        notifyObservers
        return err


    override def toString: String =
        return game.toString()

