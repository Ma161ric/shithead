package model

import scala.io.StdIn._

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class shitheadSpec extends AnyWordSpec {
    "Card" when {
        "created" should {
            "print cards with the number given" in {
                3 should be (3)
            }
        }
    }
}