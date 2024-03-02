package edu.ntnu.stud.cardgame.data;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class CardCollection {
  private final ArrayList<Card> cards = new ArrayList<>();

  public CardCollection() {}

  public Card getCard(int index) {
    return cards.get(index);
  }

  public void addCard(Card card) {
    cards.add(card);
  }

  public void addCards(@NotNull CardCollection collection) {
    cards.addAll(collection.cards);
  }

  public void addCards(@NotNull ArrayList<Card> cards) {
    this.cards.addAll(cards);
  }

  public int getSize() {
    return cards.size();
  }

  public int getCardValues() {
    return cards
        .stream()
        .mapToInt(Card::getValueNumber)
        .sum();
  }

  public String getAllHearts() {
    if (cards.isEmpty()) {
      return "No Hearts";
    }
    return cards
        .stream()
        .filter(card -> card.getSuit() == Card.Suit.HEARTS)
        .map(Card::getStringRepresentation)
        .reduce("", (a, b) -> a + " " + b);
  }

  public boolean hasQueenOfSpades() {
    return cards
        .stream()
        .anyMatch(card -> "♠Q".equals(card.getStringRepresentation()));
  }

  public boolean is5Flush() {
    if (cards.size() != 5) {
      return false;
    }
    return cards
        .stream()
        .map(Card::getSuit)
        .distinct()
        .count() == 1;
  }
}
