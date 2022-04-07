package src.main.scala.htwg.model

import Card._

case class CardDeck() {

    def createDeck(numCards:Int) =
        val allCards = new Array[Card](numCards + 1)
        for (i <- 1 to numCards) {
            val r = new scala.util.Random
            val r1 = 1 + r.nextInt(9)
            val card = new Card()
            card.createCard(r1)
            allCards(i) = card
        }
        
        println("deck created")
        
        

    
    
}