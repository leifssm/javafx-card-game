module edu.ntnu.stud.javafxcardgame {
    requires javafx.controls;
    requires javafx.fxml;
  requires org.jetbrains.annotations;


  opens edu.ntnu.stud.javafxcardgame to javafx.fxml;
    exports edu.ntnu.stud.javafxcardgame;
}