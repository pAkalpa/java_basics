package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Controller {
    @FXML
    private AnchorPane aPane;

    @FXML
    private Label welcomeLabel;

    @FXML
    private Label unId;

    @FXML
    private Label pwd;

    @FXML
    private TextField unField;

    @FXML
    private PasswordField pwdField;

    @FXML
    private Button signinButton;

    @FXML
    private Button signupButton;

    @FXML
    void callSignupForm(ActionEvent event) {
        try {
            Signup.display();
        } catch (Exception e) {
            System.out.println("Error Window");
        }
    }
}
