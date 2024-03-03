package edu.ntnu.stud.cardgame.view;

import edu.ntnu.stud.cardgame.data.Card;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class CardNode extends AnchorPane {
  public CardNode(Card card) {
    this(card.getStringRepresentation(), card.getSuit().getColor());
  }
  public CardNode(String card, String color) {
    super();
    setStyle("-fx-border-radius: 10px; -fx-border-color: black; -fx-border-width: 1px; -fx-background-color: white; -fx-padding: 10px 10px 10px 10px; -fx-background-radius: 10px;");
    setPrefSize(100, 140);
    setMaxSize(100, 140);

    Label cardText = new Label(card);
    setLeftAnchor(cardText, 2.0);
    setTopAnchor(cardText, 2.0);

    cardText.setStyle("-fx-text-fill: " + color + ";");
    getChildren().add(cardText);
  }
}
