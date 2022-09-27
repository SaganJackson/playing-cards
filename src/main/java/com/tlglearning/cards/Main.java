package com.tlglearning.cards;

import com.tlglearning.cards.model.Card;
import com.tlglearning.cards.model.Deck;

import java.security.SecureRandom;
import java.util.Comparator;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
    //TODO Create an instance of Deck
    Deck deck = new Deck();

    //TODO Print the string representation of the deck
    System.out.println(deck);

    //TODO Create an acceptable source of randomness
    Random rng = new SecureRandom();

    //TODO Shuffle the deck, using the created source of randomness
    deck.shuffle(rng);

    //TODO Print the string representation of the deck after shuffling
    System.out.println(deck);

    deck.sort();
    System.out.println(deck);
    deck.sort(new ColorFirst());
    System.out.println(deck);

  }
}

class ColorFirst implements Comparator<Card> {

  @Override
  public int compare(Card card1, Card card2) {
    int comparison = card1.suit().color().compareTo(card2.suit().color());
    if (comparison == 0) {
      comparison = card1.suit().compareTo(card2.suit());
      if (comparison == 0) {
        comparison = -card1.rank().compareTo(card2.rank());
      }
    }
    return comparison;
  }
}


