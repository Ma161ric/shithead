package scala

import scala.io.StdIn._

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class shitheadSpec extends AnyWordSpec {
  "shithead" when {
    val numCards = 4
    var f = ""

    
    def allCards(numCards:Int) = "" + topBar(numCards) + numbers(numCards) + subBar(numCards)
    def eol = sys.props("line.separator")
    def bar = "+-+ "
    def topBar(numCards:Int) = (bar * numCards + eol)
    def subBar(numCards:Int) = (eol + bar * numCards + eol)
    def numbers(numCards:Int) = for (i <- 1 to numCards){
      f = f + "|" + i + "| "
    }

    "created with the given parameters " should {
      "print cards with the number given" in {
        allCards(numCards) should be ("" + topBar(numCards) + numbers(numCards) + subBar(numCards))

      }
      "have allCards starting with" in {
        allCards(numCards) should startWith ("" + topBar(numCards))
      }
      "have allCards end with +-+" in {
        allCards(numCards) should endWith ("+-+ " + eol)
      }

      "have a bar" in {
        bar should be ("+-+ ")
      }
      "Have a eol" in {
        eol should be (sys.props("line.separator"))
      }
      "have a topBar" in {
        topBar(4) should be (bar * 4 + eol)
      }
      "have a subBar" in {
        subBar(4) should be (eol + bar * 4 + eol)
      }
      "have numbers" in {
        numbers(4) should be ("|1| |2| |3| |4| ")
      }
    }
  }
}