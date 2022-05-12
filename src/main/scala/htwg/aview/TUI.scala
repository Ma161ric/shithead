package src.main.scala.htwg
package aview

import scala.io.StdIn._
import scala.util.Random
import controller.Controller
import util.Observer

class TUI(controller: Controller) extends Observer:
    controller.add(this)
    def run =
        println(controller.game.toString)
        inputLoop()

    override def update = println(controller.game.toString)

    val ERROR = -1
    val EXIT = 0
    val SUCCESS = 1

    // def this() = this(new Controller(Game("Spieler1", "Spieler2", "Spieler3", "Spieler4")))

    def inputLoop(): Unit =
        convertinputString(readLine) match{
            case ERROR   => printhelp()
            case EXIT    => print("bye\n")
            case SUCCESS => print("\n\n")
        }
        inputLoop()

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
            case "new" =>
                controller.game = controller.newG(readLine("Bitte Spielername 1 eingeben:     "),
                    readLine("Bitte Spielername 2 eingeben:     "),
                    readLine("Bitte Spielername 3 eingeben:     "),
                    readLine("Bitte Spielername 4 eingeben:     "))
                return SUCCESS
            case "add" =>
                if (in.size == 3) {
                    val err = controller.add(in(1), in(2))
                    if (err == -3) {
                        Console.println("Falschen Namen eingegeben!")
                        return ERROR
                    } else if (err == -2) {
                        Console.println("Karte ist nichtmehr im Stack!")
                        return ERROR
                    } else if (err == -1) {
                        Console.println("Ungültige Karte!")
                        return ERROR
                    } else {
                        return SUCCESS
                    }
                } else {
                    Console.println("Falscher add Aufruf!")
                    return ERROR
                }

            case "take" | "+" =>
                if (in.size == 2) {
                    val err = controller.take(in(1))
                    if (err == -3) {
                        Console.println("Falschen Namen eingegeben!")
                        return ERROR
                    }
                } else {
                    Console.println("take oder + ist in diesem Zustand nicht möglich!")
                    return ERROR
                }
                return SUCCESS;

            case "place" | "-" =>
                if (in.size < 2) {
                    Console.println("Falscher place Aufruf!")
                    return ERROR
                } else {
                    val err = controller.place(in(1), in(2).toInt - 1)
                    if (err == -4) {
                        Console.println("place oder - ist nicht möglich in diesem Zustand!")
                        return ERROR
                    } else {
                        return SUCCESS
                    }
                }

            case _ =>
                print("wrong input, there are these commands: \n")
                return ERROR
        

    def printhelp() =
        Console.print("""
        Befehlsuebersicht fuer shithead:
        - help | h          : commands for shithead
        - exit | q          : leaves the game
        - new  |                         : creates new game
        - add <player> <card>            : plus one card at given player
        - take <player> | + <player>     : adds a random card to given player 
        - place <index> | - <index>      : places card from player to mid
        """ + "\n")
