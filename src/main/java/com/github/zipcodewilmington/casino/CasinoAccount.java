package com.github.zipcodewilmington.casino;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccount` is registered for each user of the `Arcade`.
 * The `ArcadeAccount` is used to log into the system to select a `Game` to play.
 */

/**
 * Liu: I change all int to double
 */
public class CasinoAccount {
    // test result: cannot assign a value to final variable
    // private final String accountName;
    private String accountName;
    // test result: cannot assign a value to final variable
    //private final String accountPassword;
    private String accountPassword;
    //Liu: I set 200 as default value of accountBalance for test purpose
    public double accountBalance = 200.00;


    public CasinoAccount (String accountName, String accountPassword){
        this.accountName = accountName;
        this.accountPassword = accountPassword;
    }

    public CasinoAccount (String accountName, String accountPassword, int accountBalance){
        this.accountName = accountName;
        this.accountPassword = accountPassword;
        this.accountBalance = accountBalance;
    }

    // A empty constructor
    public CasinoAccount(){

    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void addAccountBalance(double amount){
        accountBalance += amount;
    }

    public void subtractAccountBalance(double amount){
        accountBalance -= amount;
    }

    public boolean checkAccountBalance(double amount){
        if (accountBalance >= amount) return true;
        else return false;
    }

}
