package edu.ntnu.stud.cardgame;

import edu.ntnu.stud.cardgame.data.Card;
import edu.ntnu.stud.cardgame.data.CardCollection;
import edu.ntnu.stud.cardgame.data.CardDeck;
import edu.ntnu.stud.cardgame.view.CardNode;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class CardGameController {

  @FXML
  private Text flushText;

  @FXML
  private Text heartsText;

  @FXML
  private Text queenText;

  @FXML
  private StackPane stackPane;

  @FXML
  private Text sumText;

  private final CardDeck deck = new CardDeck();
  private final CardCollection hand = new CardCollection();

  @FXML
  void checkCards() {
    updateTexts();
  }

  @FXML
  void dealCards() {
    ArrayList<Card> cards = deck.dealHand(5);
    hand.discard();
    hand.addCards(cards);
    displayCards();
  }

  void displayCards() {
    var childNodes = stackPane.getChildren();
    childNodes.clear();

    int rotationLength = 200;
    double rotation, order;
    float offset = (float) (hand.getSize() - 1) / 2;

    for (int i = 0; i < hand.getSize(); i++) {
      Card card = hand.getCard(i);
      CardNode node = new CardNode(card);

      order = i - offset;
      rotation = order * 15 * Math.PI / 180;

      node.setTranslateX(Math.sin(rotation) * rotationLength);
      node.setTranslateY(node.getPrefHeight() - Math.cos(rotation) * rotationLength);
      node.setRotate(order * 15);

      childNodes.add(node);
    }
  }

  void updateTexts() {
    sumText.setText(String.valueOf(hand.getCardValues()));
    heartsText.setText(hand.getAllHearts());
    queenText.setText(hand.hasQueenOfSpades() ? "Yes" : "No");
    flushText.setText(hand.is5Flush() ? "Yes" : "No");
  }
}
