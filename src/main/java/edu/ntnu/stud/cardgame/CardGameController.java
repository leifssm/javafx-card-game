package edu.ntnu.stud.cardgame;

import edu.ntnu.stud.cardgame.data.Card;
import edu.ntnu.stud.cardgame.data.CardCollection;
import edu.ntnu.stud.cardgame.data.CardDeck;
import javafx.event.ActionEvent;
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

  }

  @FXML
  void dealCards() {
    ArrayList<Card> cards = deck.dealHand(5);
    hand.addCards(cards);
  }
}
