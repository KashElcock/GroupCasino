package com.github.zipcodewilmington.casino.games.highestrolldice;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.dices.Dices;
import java.util.Date;

public class HighestRollDiceGame implements GameInterface {
    int aiRollNumber = 0;
    int playerRollNumber = 0;
    String playerInput = "";
    boolean gameOver = false;
    Dices dice = new Dices();

    public void add(PlayerInterface player) {

    }

    public void remove(PlayerInterface player) {

    }

    public void run() {

        one:
            System.out.println("Player v.S. AI ! roll 3 dices, higher number win the game.");

            while (!gameOver || !playerInput.equals("stop")) {
                aiRollNumber = dice.tossAndSum();
                playerInput = GameInterface.getSringInput("Please type 'roll' to roll dice, 'stop' to stop game.");
                if (playerInput.equals("roll")) {
                    playerRollNumber = dice.tossAndSum();

                } else if (playerInput.equals("stop")) {
                    playerInput = "stop";
                    break;
                }
                try{
                    System.out.println("Dices rolling......");
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

                if (aiRollNumber == playerRollNumber) {
                    System.out.println("A.I. rolls " + aiRollNumber + " and player rolls " + playerRollNumber + " tie game, try again!");
                }
                if (aiRollNumber > playerRollNumber) {
                    System.out.println("A.I. rolls " + aiRollNumber + " and player rolls " + playerRollNumber + " try again!");
                }
                if (aiRollNumber < playerRollNumber) {
                    System.out.println("A.I. rolls " + aiRollNumber + " and player rolls " + playerRollNumber + " you win!");
                    gameOver = true;
                    playerInput = GameInterface.getSringInput("Congrats, one more Round? Y/N");
                    if (playerInput.equals("Y")) {
                        gameOver = false;
                        playerInput = "";

                    } else if (playerInput.equals("N")) {
                        break;
                    }

                }

            }

            if (playerInput.equals("stop")) {
                System.out.println("Player stop this game! Redirecting to dashboard...... ");
            }
        }
        //public HighestRollDiceGame(){ run();}
    }

