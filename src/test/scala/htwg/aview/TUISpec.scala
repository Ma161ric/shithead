package htwg.aview

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

import src.main.scala.htwg.model._
import src.main.scala.htwg.aview._


class TUISpec extends AnyWordSpec {
    "TUI" when {
        val tui = new TUI()
        "have a method run(String) that checks the output of convertInputString" in {
            tui.run("") shouldBe (tui.printhelp())
        }
        "have a method convertinputString(String) that calls the controller to execute the command" in {
        tui.convertinputString("") shouldBe (tui.ERROR)
        tui.convertinputString("a") shouldBe (tui.ERROR)

        tui.convertinputString("createCard 1") shouldBe (tui.SUCCESS)
        tui.convertinputString("createCard 11") shouldBe (tui.ERROR)

        tui.convertinputString("createDeck 1") shouldBe (tui.SUCCESS)
        tui.convertinputString("createDeck 11") shouldBe (tui.SUCCESS)
        tui.convertinputString("createDeck 11 sd") shouldBe (tui.ERROR)

        tui.convertinputString("help") shouldBe (tui.SUCCESS)
        tui.convertinputString("_") shouldBe (tui.ERROR)

        tui.convertinputString("h") shouldBe (tui.SUCCESS)
        tui.convertinputString("q") shouldBe (tui.EXIT)
        tui.convertinputString("exit") shouldBe (tui.EXIT)

        }
        
    }
}