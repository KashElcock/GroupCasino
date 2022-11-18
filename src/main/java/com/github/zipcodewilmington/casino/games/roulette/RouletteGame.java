package com.github.zipcodewilmington.casino.games.roulette;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.Scanner;

public class RouletteGame implements GameInterface {

    int betAmount;
    int input = 0;
    int balance = 50;
    int singleNumber;

    @Override
    public void add(PlayerInterface player) {

    }

    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public void run() {

        System.out.println("Welcome to Roulette!");
        int betOptionSelected = 1;
        printBetOptions();
        while (balance > 0 && betOptionSelected != 0) {
            System.out.println("Please select the bet you would like to place. To exit input 0.");
            betOptionSelected = userBetOptionInput();
        }
            while (true) {
                if (betOptionSelected == 0) {
                    break;
                }
                if (betOptionSelected > 8) {
                    System.out.println("Please enter a valid bet option.");
                } else if (betOptionSelected == 5) {
                    System.out.println("What number would you like to bet on, 0-36? (for 00, please select 37)");
                    singleNumber = userBetOptionInput();
                } else if (betOptionSelected == 1 || betOptionSelected == 2 || betOptionSelected == 3
                        || betOptionSelected == 4 || betOptionSelected == 6
                        || betOptionSelected == 7 || betOptionSelected == 8) {
                }
                System.out.println("Please select enter the amount you would like to bet:");
                userBetAmountInput();

                RouletteBall result;
                result = results.results();
                playerBetOptionResult(betAmount, results, input);
                System.out.println("Spin: " + result.getColor());
                System.out.println("Your balance is now " + balance + " . Select 1 to play again or 0 to exit.");
                int playAgain = userBetOptionInput();
                if (playAgain == 0) {
                    break;
                } else {
                    continue;
                }
            }
        }
    RoulletteBallResults results = new RoulletteBallResults();

    public void printBetOptions() {
        System.out.println("Bet Option 1: Red | 1:1 Payout");
        System.out.println("Bet Option 2: Black | 1:1 Payout");
        System.out.println("Bet Option 3: Even | 1:1 Payout");
        System.out.println("Bet Option 4: Odd | 1:1 Payout");
        System.out.println("Bet Option 5: Single Number | 35:1 Payout");
        System.out.println("Bet Option 6: Number 1-12 | 2:1 Payout");
        System.out.println("Bet Option 7: Number 13-24 | 2:1 Payout");
        System.out.println("Bet Option 8: Number 25-36 | 2:1 Payout");
    }

    public int userBetOptionInput() {
        Scanner scan = new Scanner(System.in);
        input = scan. nextInt();
        return input;
    }

    public void userBetAmountInput() {
        Scanner scan = new Scanner(System.in);
        betAmount = scan.nextInt();
    }

    public void playerBetOptionResult(int betAmount, RoulletteBallResults result, int input) {

        if (input == 1 && result.getColor() == "Red") {this.balance += betAmount;}
        else if (input == 2 && result.getColor() == "Black") {this.balance += betAmount;}
        else if (input == 3 && result.getNumber() % 2 == 0) {this.balance += betAmount;}
        else if (input == 4 && result.getNumber() % 2 != 0) {this.balance += betAmount;}
        else if (input == 5 && result.getNumber() == singleNumber) {this.balance += balance * (betAmount * 35);}
        else if (input == 6 && result.getNumber() >= 1 && result.getNumber() <= 12) {this.balance += balance * (betAmount * 2);}
        else if (input == 7 && result.getNumber() >= 13 && result.getNumber() <= 24) {this.balance += balance * (betAmount * 2);}
        else if (input == 8 && result.getNumber() >= 25 && result.getNumber() <= 36) {this.balance += balance * (betAmount * 2);}
    }
}
