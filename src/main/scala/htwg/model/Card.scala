package model
package htwg

case class Card(value:Int) {
    def oneCard(value:Int) = bar + eol + cardValue(value) + eol + bar + eol
    def eol = sys.props("line.separator")
    def bar = "+-+"
    def cardValue(value:Int) = ("|" + value + "| ")
}