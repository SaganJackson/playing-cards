package com.tlglearning.cards.model;

import java.util.Objects;

//Object is the super class
public class Card implements Comparable<Card> {

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
  public int hashCode() {
    return Objects.hash(rank, suit); // FIXME: Move this to initialization.

  }

  @Override
  public boolean equals(Object obj) {
    boolean result;
    if (this == obj) {
      result = true;
    } else if (obj instanceof Card) {
      Card other = (Card) obj;
      result = (this.rank == other.rank && this.suit == other.suit); //enums I can compare with ==
    } else {
      result = false;
    }
    return result;
  }

  @Override
  public String toString() {
    return rank.symbol() + suit.symbol();
  }

  @Override
  public int compareTo(Card other) {
    int comparison = suit.compareTo(other.suit);
    if (comparison == 0) {
      comparison = rank.compareTo(other.rank);
    }
    return comparison;

  }


}
