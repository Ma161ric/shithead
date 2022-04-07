package htwg.model

case class Card() {
    
    def oneCard(value:Int) = bar + eol + cardColorValue(value:Int) + eol + bar + eol
    def cardColorValue(value:Int) = ("|" + value + "| ")
    val eol = sys.props("line.separator")
    val bar = "+-+"
    def createCard(value:Int) = println(bar + eol + cardColorValue(value) + eol + bar + eol)
}