package com.tlglearning.cards.model;

//Object is the super class
public class Card {

  private final Rank rank;
  private final Suit suit;


  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  //rank accessor or getter
  public Rank rank() {
    return rank;
  }

  //suit accessor or getter
  public Suit suit() {
    return suit;
  }

  @Override
  public String toString() {
   return rank.symbol() + suit.symbol();
  }

  // TODO: Override equals method.
  //TODO: Override hashCode method.
}
