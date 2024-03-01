package edu.ntnu.stud.cardgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(@NotNull Stage stage) throws IOException {
        Parent content = FXMLLoader.load(
            Objects.requireNonNull(getClass().getResource("hello-view.fxml"))
        );
        Scene scene = new Scene(content, 320, 240);
        stage.setTitle("Card Game!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}