1+1
2*3

val r = new scala.util.Random
val r1 = 1 + r.nextInt(8)
val numCards = 4

def oneCard = bar + eol + cardValue(r1) + eol + bar + eol
def eol = sys.props("line.separator")
def bar = "+-+"
def cardValue(r1:Int) = ("|" + r1 + "| ")

/*while (numCards > 1 && numCards < 9) {
    for (i <- 1 to numCards) {
            val r = new scala.util.Random
            val r1 = 1 + r.nextInt(8)
            println(oneCard)
    }
}


println(cardValue(4))
println(oneCard(numCards))*/
