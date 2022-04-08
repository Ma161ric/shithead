package src.main.scala.htwg.aview

import scala.io.StdIn._
import scala.util.Random
import src.main.scala.htwg.model._

class TUI() :
  val ERROR = -1
  val EXIT = 0
  val SUCCESS = 1


  def run(input: String) =
    convertinputString(input) match{
      case ERROR   => printhelp()
      case EXIT    => print("bye\n")
      case SUCCESS => print("\n\n")
    }

  def convertinputString(input: String): Int =
    if (input.size == 0)
      print("no input!\n")
      return ERROR

    val in = input.split(" ")
    in(0) match
      case "exit" | "q" => return EXIT
      case "help" | "h" =>
        printhelp()
        return SUCCESS
      case "createCard" =>
            if (in.size == 2) {
                val card = new Card
                if (in(1).toInt < 10){
                    println(card.createCard(in(1).toInt))
                    return SUCCESS

                } else {
                    Console.println("too big number!")
                    return ERROR
                }

            }  else {
                Console.println("wrong createCard call!")
                return ERROR
            }

      case "createDeck" =>
        if (in.size == 2) {
            val cardDeck = new CardDeck
            cardDeck.createDeck(in(1).toInt)
            println("deck created!")
            return SUCCESS
        } else {
          Console.println("wrong createDeck call!")
          return ERROR
        }

      case _ =>
        print("wrong input, there are these commands: \n")
        return ERROR
      

  def printhelp() =
    Console.print("""
              Befehlsuebersicht fuer shithead:
              - help | h                       : commands for shithead
              - exit | q                       : leaves the game
              - createCard n                   : creates a card with the given number
              - createDeck n                   : creates a carddeck with the number of cards given
              """ + "\n")
