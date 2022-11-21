package com.github.zipcodewilmington.casino;

public abstract class Player extends CasinoAccount implements PlayerInterface {
    public Player(String accountName, String accountPassword) {
        super(accountName, accountPassword);
    }

    public Player(String accountName, String accountPassword, double accountBalance) {
        super(accountName, accountPassword, accountBalance);
    }

    public double getAccountBalance() {
        return super.getAccountBalance();
    }

}
