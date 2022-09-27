package com.tlglearning.cards;

import com.tlglearning.cards.model.Card;
import com.tlglearning.cards.model.Deck;
import com.tlglearning.cards.strategy.ColorFirst;
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


