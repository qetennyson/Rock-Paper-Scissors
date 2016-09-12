package com.wesleyreisz.rockpaperscissors.Game;

import android.graphics.Color;
import com.wesleyreisz.rockpaperscissors.R;

/**
 * Created by wesleyreisz on 9/13/15.
 */
public class GameUtils {
    public static final String BEATS = "Player beats computer";
    public static final String LOSES_TO = "Player loses to computer";
    public static final String TIES = "Player ties computer";

    public static Integer getComputerChoice(){
        /*
        TODO: Implement a random number generator that returns of of the three games options.
         */
        return  R.id.btnRock;
    }

    public static String evaluateWinner(Integer playerSelectedChoice, Integer computerSelectedChoice) {
        /*
         TODO: Create an Interface that has a super type method named eval.
         TODO: Create classes that implement the interface.
         TODO: Based on playerChoice, create an instance of that object (IE Rock)
         TODO: Call the eval method on that object passing in the computer's choice.
         TODO: Implement the logic for each of the game types to determine the winner.
         */

        if (playerSelectedChoice==R.id.btnPaper && computerSelectedChoice==R.id.btnRock) {
            // PLAYER BEATS COMP.
            return BEATS;
        } else if(playerSelectedChoice==R.id.btnPaper && computerSelectedChoice==R.id.btnScissors) {
            // PLAYER LOSES TO COMP.
            return LOSES_TO;
        } else if(playerSelectedChoice==R.id.btnPaper && computerSelectedChoice==R.id.btnPaper) {
            // PLAYER TIES TO COMP.
            return TIES;
        } else if(playerSelectedChoice==R.id.btnRock && computerSelectedChoice==R.id.btnScissors) {
            // PLAYER BEATS COMP.
            return BEATS;
        } else if(playerSelectedChoice==R.id.btnRock && computerSelectedChoice==R.id.btnPaper) {
            // PLAYER LOSES TO COMP.
            return LOSES_TO;
        } else if(playerSelectedChoice==R.id.btnRock && computerSelectedChoice==R.id.btnRock) {
            // PLAYER TIES TO COMP.
            return TIES;
        } else if(playerSelectedChoice==R.id.btnScissors && computerSelectedChoice==R.id.btnPaper) {
            // PLAYER BEATS COMP.
            return BEATS;
        } else if(playerSelectedChoice==R.id.btnScissors && computerSelectedChoice==R.id.btnRock) {
            // PLAYER LOSES TO COMP.
            return LOSES_TO;
        } else {
            // PLAYER TIES TO COMP.
            return TIES;
        }


    }

    public static Integer convertButtonToImage(Integer buttonChoice) {
        if(buttonChoice==R.id.btnRock){
            return R.drawable.rock;
        }else if (buttonChoice==R.id.btnPaper){
            return R.drawable.paper;
        }else{
            return R.drawable.scissors;
        }
    }

    public static int defineTextColor(String msg) {
        if(GameUtils.LOSES_TO.equalsIgnoreCase(msg)){
            return Color.RED;
        }else if(GameUtils.BEATS.equalsIgnoreCase(msg)){
            return Color.GREEN;
        }else{
            return Color.BLACK;
        }
    }

}


