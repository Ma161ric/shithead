package htwg

import model._
import scala.compiletime.ops.int
import scala.io.StdIn._

@main def run: Unit =
    println("welcome to shithead!\n")
    println("type in number of cards:")
    var numCards = readInt()
    while (numCards < 1 || numCards > 9) {
        println("wrong input. pls type again:")
        numCards = readInt()
    }
    CardDeck(numCards)
    

