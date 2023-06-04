package com.example.hangman;

import java.util.ArrayList;
import java.util.Arrays;

public class GameStates {

    static String GetState(int x){
        ArrayList<String> hangManLives = new ArrayList<>(Arrays.asList(
                """
                +---+
                |   |
                    |
                    |
                    |
                    |
              =========""",
                """
                +---+
                |   |
                O   |
                    |
                    |
                    |
              =========""",
                """
                +---+
                |   |
                O   |
                |   |
                    |
                    |
              =========""",
                """
                +---+
                |   |
                O   |
               /|   |
                    |
                    |
              =========""",
                """
                +---+
                |   |
                O   |
               /|\\  |
                    |
                    |
              =========""",
                """
                +---+
                |   |
                O   |
               /|\\  |
               /    |
                    |
              =========""",
                """
                +---+
                |   |
                O   |
               /|\\  |
               / \\  |
                    |
              ========="""
        ));
        if(x >= hangManLives.size()){
            return "GAME OVER";
        }
        return hangManLives.get(x);
    }

}
