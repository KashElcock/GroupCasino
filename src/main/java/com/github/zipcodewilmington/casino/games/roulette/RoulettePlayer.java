package com.github.zipcodewilmington.casino.games.roulette;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.Player;
import com.github.zipcodewilmington.casino.PlayerInterface;

public class RoulettePlayer extends Player implements PlayerInterface {


    public RoulettePlayer(String accountName, String accountPassword) {
        super(accountName, accountPassword);
    }

    public RoulettePlayer(String accountName, String accountPassword, double accountBalance) {
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
