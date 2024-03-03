package edu.ntnu.stud.cardgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Objects;

public class CardGameApplication extends Application {
  @Override
  public void start(@NotNull Stage stage) throws IOException {
    Parent content = FXMLLoader.load(
        Objects.requireNonNull(getClass().getResource("card-game.fxml"))
    );
    Scene scene = new Scene(content, 700, 450);
    stage.setTitle("Card Game!");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}
