package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Signup implements Initializable {
    public static void display() throws IOException {
        Parent root = FXMLLoader.load(Signup.class.getResource("signup.fxml"));
        root.getStylesheets().add(Signup.class.getResource("signup.css").toString());
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Signup");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private AnchorPane aPane;

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private TextField ageField;

    @FXML
    private DatePicker dateOfBirth;

    @FXML
    private ToggleGroup genderR;

    @FXML
    private ChoiceBox<String> civilStatus;

    @FXML
    private ComboBox<?> Country;

    @FXML
    private TextField email;

    @FXML
    private TextField mobileNo;

    @FXML
    private TextField userName;

    @FXML
    private PasswordField password;

    @FXML
    private PasswordField confirmPassword;

    @FXML
    private Label gender;

    @FXML
    private Label title;

    @FXML
    private Button clear;

    @FXML
    private Button submit;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> status = FXCollections.observableArrayList("Single", "Married");
        civilStatus.setItems(status);
    }
}
