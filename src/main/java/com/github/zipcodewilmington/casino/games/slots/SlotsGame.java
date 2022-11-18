package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.casino.games.CasinoGames;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame extends CasinoGames implements GameInterface {

    private SlotsPlayer slotsPlayer = null;
    int slot1;
    int slot2;
    int slot3;
    int input;
    double balance;
    @Override
    public void add(PlayerInterface player) {
    }

    @Override
    public void remove(PlayerInterface player) {
    }

    @Override
    public void run() {
        while (true){
            openingMessage();
            if (userInput() == 2) break;
            pullLever();

            PlayerInterface.addAccountBalance(balance);
            System.out.println("Casino account balance: " + balance);
        }

    }

    public void openingMessage() {
        System.out.println("Welcome to the Slot Machine, $1 to play and pull the lever");
        System.out.println("Enter 1 to pull lever, 2 to exit the machine");
    }

    public void pullLever() {
        Random rand = new Random();
        slot1 = rand.nextInt(10) + 1;
        slot2 = rand.nextInt(10) + 1;
        slot3 = rand.nextInt(10) + 1;

        System.out.println(slot1 + " | " + slot2 + " | " + slot3);

        if (slot1 == slot2 && slot1 == slot3){
            System.out.println("Winner: $20");
            balance += 20;
        }
        else if (slot1 == slot2 || slot1 == slot3 || slot2 == slot3) {
            System.out.println("Winner: $10");
            balance += 10;
        }
        else {
            System.out.println("Sorry, try again");
            balance -= 1;
        }
    }

    public int userInput() {
        Scanner scan = new Scanner(System.in);
        input = scan. nextInt();
        return input;
    }
}
