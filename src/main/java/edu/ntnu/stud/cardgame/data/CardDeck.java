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

  public ArrayList<Card> dealHand(int n) {
    if (n < 1) {
      throw new IllegalArgumentException("Invalid hand size");
    }
    if (n > cards.size()) {
      ArrayList<Card> hand = new ArrayList<>(cards);
      cards.clear();
      return hand;
    }
    ArrayList<Card> hand = new ArrayList<>();

    int pickedCard;
    for (int i = 0; i < n; i++) {
      pickedCard = rand.nextInt(cards.size());
      hand.add(cards.remove(pickedCard));
    }
    return hand;
  }
}
