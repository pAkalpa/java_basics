package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Q3EC {
    public static void display() throws IOException {
        Parent root = FXMLLoader.load(Q3EC.class.getResource("Q3E.fxml"));
        root.getStylesheets().add(Q3EC.class.getResource("/sample/styles/Q3.css").toString());
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Question 3 Extended");
        stage.getIcons().add(new Image(Q3EC.class.getResourceAsStream("/sample/home.png")));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setAlwaysOnTop(true);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    @FXML
    private TextField number1;

    @FXML
    private TextField number2;

    @FXML
    void Q2(ActionEvent event) {
        final Node source = (Node) event.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    void calculateSum(ActionEvent event) {
        String data1 = number1.getText();
        String data2 = number2.getText();
        if (data1.equals("") || data2.equals("")) {
//            total.setText("Text Fields are Empty");
            String msg = "Text Fields are Empty";
            calError(msg);
        } else if (data1.matches("^[0-9]*$") && (data2.matches("^[0-9]*$"))) {
            int sum = Integer.parseInt(data1) + Integer.parseInt(data2);
            calInfo(data1 , data2, sum);
        } else {
//            System.out.println("Non-Numeric Characters Input Detected!");
            calError();
        }
    }

    private static void calInfo(String num1, String num2, int sum) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.setAlwaysOnTop(true);
        stage.getIcons().add(new Image(Objects.requireNonNull(Q3EC.class.getResourceAsStream("/sample/home.png"))));
        alert.setTitle("Sum of Numbers");
        alert.setHeaderText(null);
        alert.setContentText("Sum of " + num1 + " and " + num2 + " is: " + sum);
        alert.showAndWait();
    }

    private static void calError() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.setAlwaysOnTop(true);
        stage.getIcons().add(new Image(Objects.requireNonNull(Q3EC.class.getResourceAsStream("/sample/home.png"))));
        alert.setTitle("Calculation Error!");
        alert.setHeaderText("Non-Numeric Characters Input Detected!");
        alert.setContentText(null);
        alert.showAndWait();
    }

    private static void calError(String error) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
        stage.setAlwaysOnTop(true);
        stage.getIcons().add(new Image(Objects.requireNonNull(Q3EC.class.getResourceAsStream("/sample/home.png"))));
        alert.setTitle("Empty Text Fields");
        alert.setHeaderText(error);
        alert.setContentText(null);
        alert.showAndWait();
    }
}
