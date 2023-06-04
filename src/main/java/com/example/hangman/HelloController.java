package com.example.hangman;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.skin.TextInputControlSkin;

import java.util.EventObject;

public class HelloController {

    @FXML
    private Label phraseToGuess;
    @FXML
    private TextArea displayMan;

    private int state = 0;
    @FXML
    protected void onLetterBtnClick(Event e) {
        Button btn = (Button) e.getSource();
        phraseToGuess.setText(btn.getText());
//        displayMan.setText(btn.getText());

        displayMan.setText(GameStates.GetState(state++));
    }


}