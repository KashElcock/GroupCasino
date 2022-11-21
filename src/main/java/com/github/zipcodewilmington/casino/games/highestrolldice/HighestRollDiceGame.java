package com.github.zipcodewilmington.casino.games.highestrolldice;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.CasinoGames;
import com.github.zipcodewilmington.casino.games.dices.Dices;
import java.util.Date;

public class HighestRollDiceGame extends CasinoGames implements GameInterface {
    @Override
    public void add(PlayerInterface player) {

    }

    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public void run() {

    }
//
//    Dices dice = new Dices();
//    //CasinoAccount ca = new CasinoAccount();
//    int aiRollNumber = 0;
//    int playerRollNumber = 0;
//    //double playerBalance = ca.getAccountBalance();
//    double playerBet = 1;
//    String playerInput = "";
//    boolean gameOver = false;
//
//
//    public void add(PlayerInterface player) {
//
//    }
//
//    public void remove(PlayerInterface player) {
//
//    }
//
//    public void run() {
//
//        while (playerBalance > 0.0 && !gameOver || !playerInput.equals("stop")) {
//            System.out.println("Player v.S. AI ! roll 3 dices, higher number win the game.");
//            playerBet = GameInterface.getIntegerInput("Your current balance: "+playerBalance+" Plase set your bet ammount (min: 1) : ");
//            if(playerBet > 0) {
//
//                    aiRollNumber = dice.tossAndSum();
//                    playerInput = GameInterface.getSringInput("Please type 'roll' to roll dice, 'stop' to stop game.");
//                    if (playerInput.equals("roll")) {
//                        playerRollNumber = dice.tossAndSum();
//
//                    } else if (playerInput.equals("stop")) {
//                        playerInput = "stop";
//                        break;
//                    }
//                    try {
//                        System.out.println("Dices rolling......");
//                        Thread.sleep(3000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                    if (aiRollNumber == playerRollNumber) {
//                        System.out.println("A.I. rolls " + aiRollNumber + " and player rolls " + playerRollNumber + " tie game, try again!");
//                    }
//                    if (aiRollNumber > playerRollNumber) {
//                        System.out.println("A.I. rolls " + aiRollNumber + " and player rolls " + playerRollNumber + " you lose!");
//                        gameOver = true;
//                        playerBalance -= playerBet;
//                        System.out.println("Your current balance: " + playerBalance);
//                        if(playerBalance > 0) {
//                            playerInput = GameInterface.getSringInput("Congrats, one more Round? Y/N");
//                            if (playerInput.equals("Y")) {
//                                gameOver = false;
//                                playerInput = "";
//
//                            } else if (playerInput.equals("N")) {
//                                break;
//                            }
//                        } else if ( playerBalance <= 0) {
//                            System.out.println("You use up all your statkes!");
//                            break;
//                        }
//                    }
//                    if (aiRollNumber < playerRollNumber) {
//                        System.out.println("A.I. rolls " + aiRollNumber + " and player rolls " + playerRollNumber + " you win!");
//                        gameOver = true;
//                        playerBalance += playerBet;
//                        System.out.println("Your current balance: " + playerBalance);
//                        if(playerBalance > 0) {
//                            playerInput = GameInterface.getSringInput("Congrats, one more Round? Y/N");
//                            if (playerInput.equals("Y")) {
//                                gameOver = false;
//                                playerInput = "";
//
//                            } else if (playerInput.equals("N")) {
//                                break;
//                            }
//                        } else if ( playerBalance <= 0) {
//                            System.out.println("You use up all your statkes!");
//                            break;
//                        }
//
//                    }
//
//
//            }else{
//                System.out.println("Please set a positive value!");
//            }
//
//            if (playerInput.equals("stop")) {
//                System.out.println("Player stop this game! Redirecting to dashboard...... ");
//            }
//        }
//        PlayerInterface.addAccountBalance(playerBalance);
//
//    }
//        //public HighestRollDiceGame(){ run();}
    }

