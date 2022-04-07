package model
package htwg

import Card._

case class CardDeck(numCards:Int) {
    val allCards = new Array(numCards)
    while (numCards != 0) {
        for (i <- 1 to numCards) {
            val r = new scala.util.Random
            val r1 = 1 + r.nextInt(8)
            Card c = new Card()
            allCards(i) = new Card(r1)
        }
    }
}