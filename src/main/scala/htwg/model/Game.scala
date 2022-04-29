package src.main.scala.htwg
package model

import scala.io.StdIn.readLine
import Player._
import toCard._
import CardLayout._
import Card._
import scala.io.StdIn
import util._

case class Game(player1: String, player2: String, player3: String, player4: String) :
    //Var's und Val's

    val kartenAnzahl: Int = 4

    var cardStack = CardDeck()
    val midCard = Player(
        "midstack"
    )
    var cardsInDeck =
        Card.values.size - 1
    val r = scala.util.Random
    val p1 = Player(player1)
    val p2 = Player(player2)
    val p3 = Player(player3)
    val p4 = Player(player4)
    //Befüllen der Starthand der Spieler
    playerFill(kartenAnzahl)
    //1. Karte in der Mitte:
    take("midstack")


    //Funktionen des Spiels
    //added eine Spezifische Karte(als String übergeben) auf die Hand eines Spielers
    def add(player: String, karte: String): Int =
        val card = getCard(karte)
        if (card.toString == "XX") {
            return -1;
        } else if (cardStack.cards(card) == 0) {
            return -3;
        } else if (player.equalsIgnoreCase("P1") || player.equalsIgnoreCase(p1.getName())) {
            p1.add(card)
            cardStack.cards = cardStack.cards + (card -> (cardStack.cards(card) - 1))
            return 0;
        } else if (player.equalsIgnoreCase("P2") || player.equalsIgnoreCase(p2.getName())) {
            p2.add(card)
            cardStack.cards = cardStack.cards + (card -> (cardStack.cards(card) - 1))
            return 0;
        } else {
        return -3;
        }

    //added eine Spezifische Karte(als Card übergeben) auf die Hand eines Spielers
    def add(player: String, card: Card): Int =
        if (card.toString == "XX") {
        take(player)
        } else if (cardStack.cards(card) == 0) {
        take(player)
        } else if (
        player.equalsIgnoreCase("P1") || player.equalsIgnoreCase(p1.getName())
        ) {
        p1.add(card)
        cardStack.cards = cardStack.cards + (card -> (cardStack.cards(card) - 1))
        return 0;
        } else if (
        player.equalsIgnoreCase("P2") || player.equalsIgnoreCase(p2.getName())
        ) {
        p2.add(card)
        cardStack.cards = cardStack.cards + (card -> (cardStack.cards(card) - 1))
        return 0;
        } else if (player.equals("midstack")) {
        midCard.add(card)
        cardStack.cards = cardStack.cards + (card -> (cardStack.cards(card) - 1))
        return 0;
        } else {
        return -3;
        }

    //zieht eine zufällige Karte vom Stack und gibt sie dem Spieler auf die Hand -> dekrementiert die Anzahl der Karte auf dem Stack
    def take(player: String): Int =
        val rnd = r.nextInt(cardsInDeck - 1)
        return add(player, Card.values(rnd))

    def playerFill(count: Int) =
        for (i <- 1 to count) {
            take(p1.getName())
            take(p2.getName())
            take(p3.getName())
            take(p4.getName())
        }
    

    def place(player: String, ind: Int): Int =
        if (player.equals(p1)) { //player1
            val tmp = midCard.karten(0)
            //midCard.karten.updated(0, p1.karten(ind))
            midCard.karten = midCard.karten.updated(0, p1.karten(ind))
            p1.removeInd(ind)
            cardStack.cards = cardStack.cards + (tmp -> ((cardStack.cards(tmp) + 1)))
            return 0
        } else if (player.equals(p2)) {
            val tmp = midCard.karten(0)
            midCard.karten = midCard.karten.updated(0, p2.karten(ind))
            p2.removeInd(ind)
            cardStack.cards = cardStack.cards + (tmp -> ((cardStack.cards(tmp) + 1)))
            return 0
        } else if (player.equals(p3)) {
            val tmp = midCard.karten(0)
            midCard.karten = midCard.karten.updated(0, p3.karten(ind))
            p3.removeInd(ind)
            cardStack.cards = cardStack.cards + (tmp -> ((cardStack.cards(tmp) + 1)))
            return 0
        } else if (player.equals(p4)) {
            val tmp = midCard.karten(0)
            midCard.karten = midCard.karten.updated(0, p4.karten(ind))
            p4.removeInd(ind)
            cardStack.cards = cardStack.cards + (tmp -> ((cardStack.cards(tmp) + 1)))
            return 0
        } else {
            return -4
        }


/*     def toString(player: Player): String =
        return player.getName() + eol + player.print() + eol + midCard.print() + eol
 */    
    override def toString: String =
        val out = p1.getName() + eol + p1.print() + eol + midCard.print() + eol
        return out