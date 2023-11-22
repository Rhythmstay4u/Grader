package com.example.grader;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private TextField seatno;

    @FXML
    private TextField name;

    @FXML
    private TextField prnum;

    @FXML
    private TextField degree;

    @FXML
    private TextField college;

    @FXML
    private TextField exam;

    @FXML
    private TextField code1;

    @FXML
    private TextField code2;

    @FXML
    private TextField code3;

    @FXML
    private TextField code4;

    @FXML
    private TextField code5;

    @FXML
    private TextField title1;

    @FXML
    private TextField title2;

    @FXML
    private TextField title3;

    @FXML
    private TextField title4;

    @FXML
    private TextField title5;

    @FXML
    private TextField marks1;

    @FXML
    private TextField marks2;

    @FXML
    private TextField marks3;

    @FXML
    private TextField marks4;

    @FXML
    private TextField marks5;

    @FXML
    private TextField total1;

    @FXML
    private TextField total2;

    @FXML
    private TextField total3;

    @FXML
    private TextField total4;

    @FXML
    private TextField total5;

    public void Submit(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Grader");
        stage.setScene(scene);
        stage.show();
    }
}