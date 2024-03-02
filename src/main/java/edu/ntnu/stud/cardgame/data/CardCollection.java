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
}
