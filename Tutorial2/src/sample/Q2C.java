package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class Q2C {
    public static void display() throws IOException {
        Parent root = FXMLLoader.load(Q2C.class.getResource("Q2.fxml"));
        root.getStylesheets().add(Q2C.class.getResource("/sample/styles/Q2.css").toString());
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setTitle("Question 2");
        stage.getIcons().add(new Image(Q2C.class.getResourceAsStream("/sample/home.png")));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setAlwaysOnTop(true);
        stage.show();
    }

    @FXML
    private javafx.scene.control.Button Q1;

    @FXML
    private Label label;

    @FXML
    void consoleIn(ActionEvent event) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text = "";
        boolean hasNext = scanner.hasNextLine();
        if (hasNext) {
            text = scanner.nextLine();
        }
        label.setText(text);
    }

    @FXML
    void consoleOut(ActionEvent event) {
        if (label.getText().equals("")) {
            System.out.println("Empty Label");
        } else {
            System.out.println(label.getText());
        }
    }

    @FXML
    void Q1(ActionEvent event) {
        final Node source = (Node) event.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    void Q3(ActionEvent event) {
        try {
            Q3C.display();
        } catch (Exception e) {
            System.out.println("Q3 Window Error");
        }
    }
}
