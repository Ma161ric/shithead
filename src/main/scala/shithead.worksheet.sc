1+1
2*3

val r = new scala.util.Random
val r1 = 1 + r.nextInt(8)
val numCards = 4

case class Card() {
    
    def oneCard(value:Int) = bar + eol + cardColorValue(value:Int) + eol + bar + eol
    def cardColorValue(value:Int) = ("|" + value + "| ")
    val eol = sys.props("line.separator")
    val bar = "+-+"
    def createCard(value:Int) = println(bar + eol + cardColorValue(value) + eol + bar + eol)
}
val card1 = new Card()
card1.createCard(5)