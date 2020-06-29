package chat;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextField textField;
    @FXML
    public TextArea textArea;

    @FXML
    public Button button;

    public void sendSMS() {
        textArea.appendText(textField.getText()+"\n");
        textField.requestFocus();
    }

}
