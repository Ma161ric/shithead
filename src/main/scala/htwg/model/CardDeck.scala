package src.main.scala.htwg
package model

import scala.collection.immutable.HashMap
import Card._

case class CardDeck() {
    var cards = HashMap[Card, Int]()
    Card.values.map(x => (x, 2)).map(x => (cards = cards + (x)))
}