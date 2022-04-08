package src.main.scala.htwg

import aview._
import model._
import scala.compiletime.ops.int
import scala.io.StdIn._

@main def run: Unit =
    println("""        +-------------------+
         welcome to shithead
        +-------------------+""")

    val tui = new TUI()

    var input: String = ""
    while (input != "q" && input != "exit"){
        Console.print("->")
        input = readLine()
        tui.run(input)
    }
    