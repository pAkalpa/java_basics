package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class signupController implements Initializable {
    @FXML
    private ComboBox<String> countryCombo;

    @FXML
    private ToggleButton passVisible;
    private String password;

    @FXML
    private PasswordField pass;

    @FXML
    private PasswordField confirmPass;

    @FXML
    void showPassword(ActionEvent event) {
        if (passVisible.isSelected()) {
            password = pass.getText();
            pass.clear();
            pass.setPromptText(password);
        } else {
            pass.setText(password);
        }
    }

    @FXML
    private ChoiceBox civilStatus;

    @FXML
    private Button clear;

    @FXML
    private TextField firstname;

    @FXML
    private TextField lastname;

    @FXML
    private TextField emailField;

    @FXML
    private TextField phoneNum;

    @FXML
    private TextField username;

    @FXML
    private DatePicker birthdayPicker;

    @FXML
    private Spinner<Integer> age;

    @FXML
    private RadioButton radMale;

    @FXML
    private RadioButton radFemale;

    @FXML
    private RadioButton radOther;

    @FXML
    void clearAll (ActionEvent event) {
        firstname.clear();
        lastname.clear();
        birthdayPicker.setValue(null);
        radMale.setSelected(false);
        age.getValueFactory().setValue(18);
        radFemale.setSelected(false);
        radOther.setSelected(false);
        countryCombo.setValue("Select Country");
        pass.clear();
        pass.setPromptText("Password");
        confirmPass.clear();
        emailField.clear();
        phoneNum.clear();
        username.clear();
        civilStatus.setValue("Civil Status");
    }

    public static void display() throws IOException {
        Parent root1 = FXMLLoader.load(signupController.class.getResource("signup.fxml"));
        root1.getStylesheets().add(signupController.class.getResource("/sample/style/signupStyle.css").toString());
        Stage stage = new Stage();
        Scene scene = new Scene(root1);
        stage.setTitle("Signup");
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> cities = FXCollections.observableArrayList();
        ObservableList<String> status = FXCollections.observableArrayList("Single","Married");

        String[] locales1 = Locale.getISOCountries();
        for (String countrylist : locales1) {
            Locale obj = new Locale("", countrylist);
            String[] city = { obj.getDisplayCountry() };
            for (int x = 0; x < city.length; x++) {
                cities.add(obj.getDisplayCountry());
            }
        }
        countryCombo.setItems(cities);
        civilStatus.setItems(status);
    }
}
