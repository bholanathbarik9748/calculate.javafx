package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import java.lang.String;

public class Controller {

    float data = 0f;
    int opeartion = -1;

    @FXML
    private Button clear;

    @FXML
    private Button startbrack;

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
    private Button point;

    @FXML
    private Button zero;

    @FXML
    private Button closebrack;

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
    private Button percentage;

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

        }else if (event.getSource() == three){
            display.setText(display.getText()+"3");

        }else if (event.getSource() == four){
            display.setText(display.getText()+"4");

        }else if (event.getSource() == five){
            display.setText(display.getText()+"5");

        }else if (event.getSource() == six){
            display.setText(display.getText()+"6");

        }else if (event.getSource() == seven){
            display.setText(display.getText()+"7");

        }else if (event.getSource() == eight){
            display.setText(display.getText()+"8");

        }else if (event.getSource() == nine){
            display.setText(display.getText()+"9");

        }else if (event.getSource() == zero){
            display.setText(display.getText()+"0");

        }else if (event.getSource() == clear){
            display.setText(" ");

        }else if (event.getSource() == point){
            display.setText(display.getText()+".");

        }else if (event.getSource() == percentage){
            display.setText(display.getText()+"%");

        }else if (event.getSource() == plus){
         data = Float.parseFloat(display.getText());
         opeartion = 1;
         display.setText(" ");
                            
        }else if (event.getSource() == mines){
            data = Float.parseFloat(display.getText());
            opeartion = 2;
            display.setText(" ");

        }else if (event.getSource() == into){
            data = Float.parseFloat(display.getText());
            opeartion = 3;
            display.setText(" ");

        }else if (event.getSource() == div){
            data = Float.parseFloat(display.getText());
            opeartion = 4;
            display.setText(" ");

        }else if (event.getSource() == closebrack){
            display.setText(display.getText()+")");

        }else if (event.getSource() == startbrack){
            display.setText(display.getText()+"(");

        } else if (event.getSource() == equal){
            float secondoperator = Float.parseFloat(display.getText());
            switch(opeartion)
            {
                case  1:
                    float ans = data + secondoperator;
                    display.setText(String.valueOf(ans));
                    break;

                    case 2:
                     ans = data - secondoperator;
                    display.setText(String.valueOf(ans));
                    break;

                    case 3:
                     ans = data * secondoperator;
                    display.setText(String.valueOf(ans));
                    break;

                    case 4:
                        try {
                            ans = data / secondoperator;
                            display.setText(String.valueOf(ans));
                        }catch (Exception e){display.setText("error");}

                        break;

            }
        }
    }
    public void insilagation(URL url , ResourceBundle rb){

    }
}
