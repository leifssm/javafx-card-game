package edu.ntnu.stud.cardgame.data;

public class Card {
  private final Suit suit;
  private final int value;

  public enum Suit {
    HEARTS("♥", "red"),
    DIAMONDS("♦", "red"),
    CLUBS("♣", "black"),
    SPADES("♠", "black");

    private final String symbol;
    private final String color;

    Suit(String s, String c) {
      this.symbol = s;
      this.color = c;
    }
  }
  public static Suit convertNumberToSuit(int number) throws IllegalArgumentException {
    return switch (number) {
      case 0 -> Suit.HEARTS;
      case 1 -> Suit.DIAMONDS;
      case 2 -> Suit.CLUBS;
      case 3 -> Suit.SPADES;
      default -> throw new IllegalArgumentException("Invalid suit number");
    };
  }
  public Card(Suit suit, int value) {
    this.suit = suit;
    if (value < 1 || value > 13) {
      throw new IllegalArgumentException("Invalid card value");
    }
    this.value = value;
  }

  public Suit getSuit() {
    return suit;
  }

  public int getValueNumber() {
    return value;
  }

  public String getValue() {
    return switch (value) {
      case 1 -> "A";
      case 11 -> "J";
      case 12 -> "Q";
      case 13 -> "K";
      default -> String.valueOf(value);
    };
  }

  @Override
  public int hashCode() {
    return suit.ordinal() * 13 + value;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj == null || obj.getClass() != this.getClass()) {
      return false;
    }
    Card other = (Card) obj;
    return suit == other.suit && value == other.value;
  }
}
