package com.github.zipcodewilmington.casino.games.numberguess;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

/**
 * Created by leon on 7/21/2020.
 */
public class NumberGuessGame implements GameInterface {

    public void add(PlayerInterface player) {

    }

    public void remove(PlayerInterface player) {

    }
    public void run() {
        int previousGuess = 0;
        int numberOfTries = 0;
        int mostRecentGuess = 0;
        int mysteryNumber = GameInterface.getMysteryNumber();
        System.out.println("Welcome to the Guessing Game Too Large Too Small");
        // System.out.println(mysteryNumber);
        while (mostRecentGuess != 100) {
            mostRecentGuess = GameInterface.getIntegerInput("Please take a guess from 0 - 10 here: " + "\n Enter 100 to exit");
            if (mostRecentGuess < 11) {
                if (mostRecentGuess == previousGuess) {
                    System.out.println("Didn't work last time, did it? Try Again!");
                } else if (mostRecentGuess == mysteryNumber) {
                    numberOfTries++;
                    System.out.println("You Win! Correct guess :)");
                } else if (mostRecentGuess < mysteryNumber) {
                    numberOfTries++;
                    System.out.println("Too Small, Try Again!");
                } else if (mostRecentGuess > mysteryNumber) {
                    numberOfTries++;
                    System.out.println("Too Large, Try Again");
                }
            } previousGuess = mostRecentGuess;
        }
        System.out.println("\nIt took you " + numberOfTries + " tries!" + "\nEnding Application");
    }

    public NumberGuessGame() {run();}
}