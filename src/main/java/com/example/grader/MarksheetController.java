package com.example.grader;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MarksheetController {
    private Model model;
    @FXML
    private Label seatno;
    @FXML
    private Label prnum;
    @FXML
    private Label name;
    @FXML
    private Label degree;
    @FXML
    private Label college;
    @FXML
    private Label exam;
    @FXML
    private Label code1;
    @FXML
    private Label code2;
    @FXML
    private Label code3;
    @FXML
    private Label code4;
    @FXML
    private Label code5;
    @FXML
    private Label title1;
    @FXML
    private Label title2;
    @FXML
    private Label title3;
    @FXML
    private Label title4;
    @FXML
    private Label title5;
    @FXML
    private Label marks1;
    @FXML
    private Label marks2;
    @FXML
    private Label marks3;
    @FXML
    private Label marks4;
    @FXML
    private Label marks5;
    @FXML
    private Label total1;
    @FXML
    private Label total2;
    @FXML
    private Label total3;
    @FXML
    private Label total4;
    @FXML
    private Label total5;
    @FXML
    private Label totalobtained;
    @FXML
    private Label totalabsolute;
    @FXML
    private Label grade1;
    @FXML
    private Label grade2;
    @FXML
    private Label grade3;
    @FXML
    private Label grade4;
    @FXML
    private Label grade5;
    @FXML
    private Label percentage;

    public void setMarksheetData(Model model) {
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

        int totalMarks = model.calculateTotalMarks();
        int totalMaxMarks = model.calculateTotalMaxMarks();
        double percentageValue = model.calculatePercentage();

        totalobtained.setText(Integer.toString(totalMarks));
        totalabsolute.setText(Integer.toString(totalMaxMarks));
        percentage.setText(String.format("%.2f%%", percentageValue));

        grade1.setText(model.calculateGrade(model.getMarks1(), model.getTotal1()));
        grade2.setText(model.calculateGrade(model.getMarks2(), model.getTotal2()));
        grade3.setText(model.calculateGrade(model.getMarks3(), model.getTotal3()));
        grade4.setText(model.calculateGrade(model.getMarks4(), model.getTotal4()));
        grade5.setText(model.calculateGrade(model.getMarks5(), model.getTotal5()));
    }
}
