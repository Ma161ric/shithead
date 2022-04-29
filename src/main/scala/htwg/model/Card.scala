package src.main.scala.htwg
package model


enum CardValue:
    case One, Two, Three, Seven, Eight, Nine, Ten, Error

enum CardColor:
    case Red, Blue, Green, Yellow, ErrorC



enum Card(color: CardColor, value: CardValue, id: String):
    case RON extends Card(CardColor.Red, CardValue.One, "RON")
    case RTW extends Card(CardColor.Red, CardValue.Two, "RTW")
    case RTH extends Card(CardColor.Red, CardValue.Three, "RTH")
    case BON extends Card(CardColor.Blue, CardValue.One, "BON")
    case BTW extends Card(CardColor.Blue, CardValue.Two, "BTW")
    case BTH extends Card(CardColor.Blue, CardValue.Three, "BTH")
    
    case XX extends Card(CardColor.ErrorC, CardValue.Error, "XX")

    def getColor: CardColor = color
    def getValue: CardValue = value
    override def toString: String = id
    

object toCard:
    def getCard(search: String): Card =
        val index = Card.values.map(x => x.toString).indexOf(search)
        if (index < 0) {
            return Card.XX
        } else {
            return Card.values(index)
    }