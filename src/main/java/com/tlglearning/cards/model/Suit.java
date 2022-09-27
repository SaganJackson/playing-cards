package com.tlglearning.cards.model;

import java.util.Locale;

public enum Suit {

  CLUBS('\u2663', Color.BLACK), // this line turns into public static final Suit CLUBS = new Suit();
  DIAMONDS('\u2662', Color.RED),
  HEARTS('\u2661', Color.RED),
  SPADES('\u2660', Color.BLACK);

  private final char symbol;
  private final Color color;

  //private is redundant for enum constructors
  Suit(char symbol, Color color) {
    this.symbol = symbol;
    this.color = color;
  }

  //method that is a getter
  public char symbol() {
    return symbol;
  }

public Color color() {
    return color;
}

  @Override
  public String toString() {
    String name = name();
    return name.charAt(0) + name.substring(1).toLowerCase(); //turns it into Clubs instead of CLUBS
  }

  public enum Color {
    BLACK, RED
  }

}
