package src.main.scala.htwg.model

case class Card() {
    
    def oneCard(value:Int) = bar + eol + cardColorValue(value:Int) + eol + bar + eol
    def cardColorValue(value:Int) = ("|" + value + "| ")
    def eol = sys.props("line.separator")
    def bar = "+-+"
    def createCard(value:Int) = bar + eol + cardColorValue(value) + eol + bar + eol
}