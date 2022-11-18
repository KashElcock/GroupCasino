package com.github.zipcodewilmington.casino.games.numberguess;
import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.CasinoAccountManager;
import com.github.zipcodewilmington.casino.Player;
import com.github.zipcodewilmington.casino.PlayerInterface;

/**
 * Created by leon on 7/21/2020.
 */
public class NumberGuessPlayer extends Player implements PlayerInterface {


    @Override
    public CasinoAccount getAccount() {
        return null;
    }

    public <SomeReturnType> SomeReturnType play() {
      //  double playerBalance = getAccountBalance();
        return null;
    }

    public NumberGuessPlayer() {
        play();
    }
}