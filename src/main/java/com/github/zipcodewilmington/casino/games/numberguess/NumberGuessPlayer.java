package com.github.zipcodewilmington.casino.games.numberguess;
import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.Player;
import com.github.zipcodewilmington.casino.PlayerInterface;

/**
 * Created by leon on 7/21/2020.
 */
public class NumberGuessPlayer extends Player implements PlayerInterface {


    public NumberGuessPlayer(String accountName, String accountPassword) {
        super(accountName, accountPassword);
    }

    public NumberGuessPlayer(String accountName, String accountPassword, double accountBalance) {
        super(accountName, accountPassword, accountBalance);
    }

    @Override
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