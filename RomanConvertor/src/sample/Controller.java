package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField romanNumber, answerNumber;

    @FXML
    private int answer;

    @FXML
     private void convertPressed(ActionEvent event){

        Convertor convertor = new Convertor();

        answer = convertor.romanToInt(romanNumber.getText());
        answerNumber.setText(Integer.toString(answer));
    }
}
