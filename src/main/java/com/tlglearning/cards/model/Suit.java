package com.tlglearning.cards.model;

import java.util.Locale;

public enum Suit {

  CLUBS('\u2663'), // this line turns into public static final Suit CLUBS = new Suit();
  DIAMONDS('\u2662'),
  HEARTS('\u2661'),
  SPADES('\u2660');

  private final char symbol;

  //private is redundant for enum constructors
  Suit(char symbol) {
    this.symbol = symbol;
  }

  //method that is a getter
  public char symbol() {
    return symbol;
  }


  @Override
  public String toString() {
    String name = name();
    return name.charAt(0) + name.substring(1).toLowerCase(); //turns it into Clubs instead of CLUBS
  }

}
