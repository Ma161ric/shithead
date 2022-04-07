package htwg.model

object CardLayout {
    val eol = sys.props("line.separator")
    val bar = "+-+"

    val row = "+" + "-" * 4
    val rowEnd = "+" + eol
    
    def udRow(cCount: Int): String =
    row * cCount + rowEnd

    def oneCard(value:Int) = bar + eol + cardValue(value) + eol + bar + eol
    def cardValue(value:Int) = ("|" + value + "| ")
}
