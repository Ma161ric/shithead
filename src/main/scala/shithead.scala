import scala.compiletime.ops.int
@main
def run:Unit = karte
def eol = "\n"
def anzahlKarten = 5
def karte = for (i <- 1 to anzahlKarten){
    println("|" + i + "|" + eol)
}
