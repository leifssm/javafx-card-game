package edu.ntnu.stud.cardgame.data;

import java.util.ArrayList;
import java.util.Random;

public class CardDeck {
  private final Random rand = new Random();
  private final ArrayList<Card> cards = new ArrayList<>();

  public CardDeck() {
    for (int i = 0; i < 4; i++) {
      for (int j = 1; j <= 13; j++) {
        cards.add(new Card(i, j));
      }
    }
  }

  public Card[] dealHand(int n) {
    if (n < 1) {
      throw new IllegalArgumentException("Invalid hand size");
    }
    if (n > cards.size()) {
      throw new IllegalArgumentException("Not enough cards in deck");
    }
    Card[] hand = new Card[n];

    int pickedCard;
    for (int i = 0; i < n; i++) {
      pickedCard = rand.nextInt(cards.size());
      hand[i] = cards.remove(pickedCard);
    }
    return hand;
  }
}
