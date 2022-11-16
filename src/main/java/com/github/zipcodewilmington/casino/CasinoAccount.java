package com.github.zipcodewilmington.casino;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccount` is registered for each user of the `Arcade`.
 * The `ArcadeAccount` is used to log into the system to select a `Game` to play.
 */
public class CasinoAccount {

    private final String accountName;
    private final String accountPassword;
    public int accountBalance;

    public CasinoAccount (String accountName, String accountPassword){
        this.accountName = accountName;
        this.accountPassword = accountPassword;
    }

    public CasinoAccount (String accountName, String accountPassword, int accountBalance){
        this.accountName = accountName;
        this.accountPassword = accountPassword;
        this.accountBalance = accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void addAccountBalance(int amount){
        accountBalance += amount;
    }

    public void subtractAccountBalance(int amount){
        accountBalance -= amount;
    }

    public boolean checkAccountBalance(int amount){
        if (accountBalance >= amount) return true;
        else return false;
    }

}
