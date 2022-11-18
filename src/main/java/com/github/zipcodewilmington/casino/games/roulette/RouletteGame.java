package com.github.zipcodewilmington.casino.games.roulette;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.Scanner;

public class RouletteGame implements GameInterface {

    int betAmount;
    int input = 0;
    int balance;
    int singleNumber;

    @Override
    public void add(PlayerInterface player) {

    }

    @Override
    public void remove(PlayerInterface player) {

    }

    @Override
    public void run() {

        System.out.println("Welcome to Roulette! Please select enter the amount you would like to bet:");

        printBetOptions();
        System.out.println("Please select the bet you would like to place. To exit input 0.");
        userBetOptionInput();

        while (balance > 0){
            if (userBetOptionInput() == 0) {
                break;
            }
            else if(userBetOptionInput() > 8){
                System.out.println("Please enter a valid bet option.");
            }
            else if (userBetOptionInput() == 5){
                singleNumber = userBetOptionInput();
            }
        }

        userBetAmountInput();
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

    public void playerBetOptionResult(int betAmount, RouletteBall result, int input) {

        if (input == 1 && result.getColor() = "Red") {this.balance += betAmount;}
        else if (input == 2 && result.getColor() = "Black") {this.balance += betAmount;}
        else if (input == 3 && result.getNumber() % 2 = 0) {this.balance += betAmount;}
        else if (input == 4 && result.getNumber() % 2 != 0) {this.balance += betAmount;}
        else if (input == 5 && result.getNumber() = singleNumber) {this.balance += balance * (betAmount * 35);}
        else if (input == 6 && result.getNumber() >= 1 && result.getNumber() <= 12) {this.balance += balance * (betAmount * 2);}
        else if (input == 7 && result.getNumber() >= 13 && result.getNumber() <= 24) {this.balance += balance * (betAmount * 2);}
        else if (input == 8 && result.getNumber() >= 25 && result.getNumber() <= 36) {this.balance += balance * (betAmount * 2);}
    }
}
