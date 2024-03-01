module edu.ntnu.stud.javafxcardgame {
    requires javafx.controls;
    requires javafx.fxml;
  requires org.jetbrains.annotations;


  opens edu.ntnu.stud.cardgame to javafx.fxml;
    exports edu.ntnu.stud.cardgame;
}