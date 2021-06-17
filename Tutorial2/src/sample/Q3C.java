package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Q3C {
    public static void display() throws IOException {
        Parent root = FXMLLoader.load(Q3C.class.getResource("Q3.fxml"));
        root.getStylesheets().add(Q3C.class.getResource("/sample/styles/Q3.css").toString());
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Question 3");
        stage.getIcons().add(new Image(Q3C.class.getResourceAsStream("/sample/home.png")));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setAlwaysOnTop(true);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
    }

    @FXML
    private Label total;

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
    void Q3E(ActionEvent event) {
        try {
            Q3EC.display();
        } catch (Exception e) {
            System.out.println("Q3E Window Error");
        }
    }

    @FXML
    void calculateSum(ActionEvent event) {
        String data1 = number1.getText();
        String data2 = number2.getText();
        if (data1.equals("") || data2.equals("")) {
            total.setText("Text Fields are Empty");
        } else if (data1.matches("^[0-9]*$") && (data2.matches("^[0-9]*$"))) {
            int sum = Integer.parseInt(data1) + Integer.parseInt(data2);
            total.setText(String.valueOf(sum));
        } else {
            total.setText("Non-Numeric Characters Input Detected!");
//            System.out.println("Non-Numeric Characters Input Detected!");
        }
    }
}
