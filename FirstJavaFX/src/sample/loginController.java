package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class loginController {
    @FXML
    private SplitPane sPane;

    @FXML
    private AnchorPane aPane1;

    @FXML
    private Label SignInTitle;

    @FXML
    private Label username;

    @FXML
    private Label password;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button signinButton;

    @FXML
    private Hyperlink forgetPW;

    @FXML
    private AnchorPane aPane2;

    @FXML
    private Label para1;

    @FXML
    private Label para2;

    @FXML
    private Label pane2Title;

    @FXML
    private Button signupButton;

    @FXML
    void showSignupForm(ActionEvent event) {
        try {
            signupController.display();
        } catch (Exception e) {
            System.out.println("Cant Load New Window");
        }
    }
}
