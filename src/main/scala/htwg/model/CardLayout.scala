package src.main.scala.htwg
package model


object CardLayout {
    val eol = System.lineSeparator()
    val row = "+" + "-" * 5
    val rowEnd = "+" + eol
    val nameSpace = " " * 6

    //scalable settings
    //creates the top or bottom row
    def udRow(cCount: Int): String =
    row * cCount + rowEnd
}
