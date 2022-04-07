package src.main.scala.htwg

import model._
import scala.compiletime.ops.int
import scala.io.StdIn._

@main def run: Unit =
    println("""        +-------------------+
         welcome to shithead
        +-------------------+""")
    println("\ntype in number of cards:")
    var numCards = readInt()
    while (numCards < 1 || numCards > 40) {
        println("wrong input. pls type again:")
        numCards = readInt()
    }
    val deck = new CardDeck
    deck.createDeck(numCards)