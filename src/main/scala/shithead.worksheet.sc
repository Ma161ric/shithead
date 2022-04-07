1+1
2*3

val r = new scala.util.Random
val r1 = 1 + r.nextInt(8)
val numCards = 4

case class Card(value:Int) {
    def oneCard(value:Int) = bar + eol + cardValue(value) + eol + bar + eol
    def eol = sys.props("line.separator")
    def bar = "+-+"
    def cardValue(value:Int) = ("|" + value + "| ")
}
val card1 = new Card(5)