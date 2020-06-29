package calc;


import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML
    public TextField textField;
    @FXML
    public Button button;

    public void clickBtnAddText() {
        textField.setText(textField.getText() + this.button.getText());
        textField.requestFocus();
    }

    public void calculate(){
//        int x = Integer.valueOf(textField.getText());
//        textField.clear();
//        textField.appendText(textField.getText()+x);
    }

    public void clear(){
        textField.clear();
    }

//    public void backspace(){
//        textField.setText(textField.getText());
//    }
}
