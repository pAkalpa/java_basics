package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Q1C {

    @FXML
    private Button clickMe;

    @FXML
    private Button next;

    @FXML
    private Label Label;

    @FXML
    private TextField name;

    @FXML
    private Label hello;

    @FXML
    void showHW(ActionEvent event) {
        Label.setText("Hello World");
        String hName = name.getText();
        hello.setText("Hello " + hName);
    }

    @FXML
    void Q2(ActionEvent event) {
        try {
            Q2C.display();
        } catch (Exception e) {
            System.out.println("Q2 Window Error");
        }
    }

    @FXML
    void clearAll(ActionEvent event) {
        name.clear();
        hello.setText("");
        Label.setText("");
    }
}
