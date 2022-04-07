package htwg.model

import htwg.model.Card._
import scala.compiletime.ops.int
import scala.io.StdIn._

@main def run: Unit =
    println("""        +-------------------+
         welcome to shithead
        +-------------------+""")
    println("\ntype in number of cards:")
    var numCards = readInt()
    while (numCards < 1 || numCards > 9) {
        println("wrong input. pls type again:")
        numCards = readInt()
    }
    val allCards = new Array[Card](numCards + 1)
    for (i <- 1 to numCards) {
        val r = new scala.util.Random
        val r1 = 1 + r.nextInt(9)
        val card = new Card()
        card.createCard(r1)
        allCards(i) = card
    }