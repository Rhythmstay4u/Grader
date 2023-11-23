package com.example.grader;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;

public class InputInfoConfirmation {
    private Model model;
    @FXML
    private TextField seatno;
    @FXML
    private TextField prnum;
    @FXML
    private TextField name;
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

    public void setData(Model model) {
        this.model = model;
        seatno.setText(model.getSeatNo());
        prnum.setText(model.getPrNum());
        name.setText(model.getName());
        degree.setText(model.getDegree());
        college.setText(model.getCollege());
        exam.setText(model.getExam());
        code1.setText(model.getCode1());
        code2.setText(model.getCode2());
        code3.setText(model.getCode3());
        code4.setText(model.getCode4());
        code5.setText(model.getCode5());
        title1.setText(model.getTitle1());
        title2.setText(model.getTitle2());
        title3.setText(model.getTitle3());
        title4.setText(model.getTitle4());
        title5.setText(model.getTitle5());
        marks1.setText(model.getMarks1());
        marks2.setText(model.getMarks2());
        marks3.setText(model.getMarks3());
        marks4.setText(model.getMarks4());
        marks5.setText(model.getMarks5());
        total1.setText(model.getTotal1());
        total2.setText(model.getTotal2());
        total3.setText(model.getTotal3());
        total4.setText(model.getTotal4());
        total5.setText(model.getTotal5());
    }

    public void Edit(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        HelloController helloController = fxmlLoader.getController();
        helloController.setEditData(model);

        stage.setTitle("Grader");
        stage.setScene(scene);
        stage.show();

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.close();
    }

    public void PrintMarksheet(ActionEvent event) throws IOException {
        model.setSeatNo(seatno.getText());
        model.setPrNum(prnum.getText());
        model.setName(name.getText());
        model.setDegree(degree.getText());
        model.setCollege(college.getText());
        model.setExam(exam.getText());
        model.setCode1(code1.getText());
        model.setCode2(code2.getText());
        model.setCode3(code3.getText());
        model.setCode4(code4.getText());
        model.setCode5(code5.getText());
        model.setTitle1(title1.getText());
        model.setTitle2(title2.getText());
        model.setTitle3(title3.getText());
        model.setTitle4(title4.getText());
        model.setTitle5(title5.getText());
        model.setMarks1(marks1.getText());
        model.setMarks2(marks2.getText());
        model.setMarks3(marks3.getText());
        model.setMarks4(marks4.getText());
        model.setMarks5(marks5.getText());
        model.setTotal1(total1.getText());
        model.setTotal2(total2.getText());
        model.setTotal3(total3.getText());
        model.setTotal4(total4.getText());
        model.setTotal5(total5.getText());

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Marksheet.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        MarksheetController marksheetController = fxmlLoader.getController();
        marksheetController.setMarksheetData(model);

        stage.setTitle("Grader");
        stage.setScene(scene);
        stage.show();

        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.close();
    }
}
