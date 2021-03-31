package client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public TextArea textArea;
    @FXML
    public TextField textFiled;

    public void sendMsg() {
        textArea.appendText(textFiled.getText()+"\n");
        textFiled.clear();
        textFiled.requestFocus();
    }
}

