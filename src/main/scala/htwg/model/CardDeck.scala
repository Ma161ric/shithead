package htwg.model

import Card._

case class CardDeck(numCards:Int) {

    def create:Unit =
        val allCards = new Array[Card](numCards + 1)
        while (numCards != 0) {
            for (i <- 1 to numCards) {
                val r = new scala.util.Random
                val r1 = 1 + r.nextInt(8)
                val card = new Card(r1)
                allCards(i) = card
            }
            println(allCards)
        }
        

    
    
}