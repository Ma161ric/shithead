package main.scala
import scala.compiletime.ops.int
import scala.io.StdIn._

@main def run: Unit =
    println("Willkommen zu Shithead!\n")

    println("Anzahl Karten eingeben:")
    var anzKarten = readInt()
    while (anzKarten < 1 || anzKarten > 9) {
    println("Falscher Input. Bitte neu eingeben:")
    anzKarten = readInt()
  }

    alleKarten(anzKarten)
    def alleKarten(x:Int) = "" + topBar(x) + zahlen(x) + subBar(x)
    def eol = sys.props("line.separator")
    def bar = "+-+ "
    def topBar(x:Int) = print(bar * x + eol)
    def subBar(x:Int) = print(eol + bar * x + eol)
    def zahlen(x:Int) = for (i <- 1 to x){
        print("|" + i + "| ")
    }
