/*package src.test.scala.htwg.model

import scala.io.StdIn._
import src.main.scala.htwg.model._


import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class CardSpec extends AnyWordSpec {
    val card = new Card()

    "Card" when {
        "created" should {
            "print cards with the number given" in {
                card.createCard(3) should be ("+-+" + sys.props("line.separator") + "|3| " + sys.props("line.separator") + "+-+" + sys.props("line.separator"))
            }
            "have a value in | |" in {
                card.cardColorValue(3) should be ("|3| ")
            }
            "have a bar" in {
                card.bar should be ("+-+")
            }
            "Have a eol" in {
                card.eol should be (sys.props("line.separator"))
            }
        }
        
    }
}*/