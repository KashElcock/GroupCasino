package com.github.zipcodewilmington.casino.games.highestrolldice;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.Player;
import com.github.zipcodewilmington.casino.PlayerInterface;

public class HighestRollDicePlayer extends Player implements PlayerInterface {

    public HighestRollDicePlayer(String accountName, String accountPassword) {
        super(accountName, accountPassword);
    }

    public HighestRollDicePlayer(String accountName, String accountPassword, double accountBalance) {
        super(accountName, accountPassword, accountBalance);
    }

    public CasinoAccount getAccount() {
        return null;
    }
    public <SomeReturnType> Object play() {
        return null;
    }

    @Override
    public double getResult(double result) {
        return 0;
    }
}
