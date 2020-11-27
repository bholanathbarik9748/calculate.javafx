package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private Button clear;

    @FXML
    private Button braket;

    @FXML
    private Button eight;

    @FXML
    private Button seven;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button piusmin;

    @FXML
    private Button zero;

    @FXML
    private Button percentage;

    @FXML
    private Button div;

    @FXML
    private Button nine;

    @FXML
    private Button into;

    @FXML
    private Button six;

    @FXML
    private Button mines;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button point;

    @FXML
    private Button equal;

    @FXML
    private TextField display;

    @FXML
    void handalbuttonaction(ActionEvent event) {
        if (event.getSource() == one){
            display.setText(display.getText()+"1");
        }else if (event.getSource() == two){
            display.setText(display.getText()+"2");
        }


    }
    public void insilagation(URL url , ResourceBundle rb){

    }
}
