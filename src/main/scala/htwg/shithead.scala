package src.main.scala.htwg

import aview.TUI
import model._
import scala.io.StdIn._
import controller.Controller

@main def run: Unit =
    println("""        +-------------------+
         welcome to shithead
        +-------------------+""")

    val game = new Game("P1","P2","P3","P4")
    val controller = Controller(game)
    val tui = TUI(controller)
    tui.run
