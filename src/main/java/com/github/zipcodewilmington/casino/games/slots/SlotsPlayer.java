package com.github.zipcodewilmington.casino.games.slots;
import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.Player;
import com.github.zipcodewilmington.casino.PlayerInterface;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsPlayer extends Player implements PlayerInterface {


    public SlotsPlayer(String accountName, String accountPassword) {
        super(accountName, accountPassword);
    }

    public SlotsPlayer(String accountName, String accountPassword, double accountBalance) {
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