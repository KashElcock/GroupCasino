package com.github.zipcodewilmington.casino.games.numberguess;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.CasinoGames;


/**
 * Created by leon on 7/21/2020.
 */
public class NumberGuessGame extends CasinoGames implements GameInterface {

    public void add(PlayerInterface player) {

    }

    public void remove(PlayerInterface player) {

    }
    public NumberGuessGame() {
        run();
    }

    public void run() {
        int previousGuess = 0;
        int numberOfTries = 0;
        int mostRecentGuess = 0;
        int mysteryNumber = GameInterface.getMysteryNumber();
        System.out.println("Welcome to the Number Guessing Game, \n You can win $10,  but for every wrong guess that decreases by $1!");
        while (mostRecentGuess != 100 && mostRecentGuess!=mysteryNumber) {
            mostRecentGuess = GameInterface.getIntegerInput("Please take a guess from 0 - 10 here: " + "\n Enter 100 to exit");
            if (mostRecentGuess < 11) {
                if (mostRecentGuess == previousGuess) {
                    System.out.println("Didn't work last time, did it? Try Again!");
                } else if (mostRecentGuess == mysteryNumber) {
                    numberOfTries++;
                    System.out.println("You Win! Correct guess :)");
                    setGameResult(10-numberOfTries);
                    System.out.println("You've won $" + (int) getGameResult());
                  //  PlayerInterface.addAccountBalance(getGameResult());
                    System.out.println("\nIt took you " + numberOfTries + " tries!");
                } else if (mostRecentGuess < mysteryNumber) {
                    numberOfTries++;
                    System.out.println("Too Small, Try Again!");
                } else if (mostRecentGuess > mysteryNumber) {
                    numberOfTries++;
                    System.out.println("Too Large, Try Again");
                }
            }
            previousGuess = mostRecentGuess;
           // System.out.println("ACCOUNT BAL IS:" + accountBalance);
        }
    }
}