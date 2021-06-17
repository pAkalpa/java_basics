package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button showButton;

    @FXML
    private Label outputLabel;

    @FXML
    private TextField titleField;

    @FXML
    private TextField firstField;

    @FXML
    private TextField lastField;

    @FXML
    void showOnLabel(ActionEvent event) {
        String title = titleField.getText();
        String first = firstField.getText();
        String last = lastField.getText();
        outputLabel.setText(title+ ". " + first + " " + last);
    }
}
