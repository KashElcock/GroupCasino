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
    //Liu: I set 200 as default value of accountBalance for test purpose
    private Double accountBalance;
    // test result: cannot assign a value to final variable
    // private final String accountName;
    private String accountName;
    // test result: cannot assign a value to final variable
    //private final String accountPassword;
    private String accountPassword;




    public CasinoAccount (String accountName, String accountPassword){
        this.accountName = accountName;
        this.accountPassword = accountPassword;
        this.accountBalance = 200.00;
    }

    public CasinoAccount (String accountName, String accountPassword, double accountBalance){
        this.accountName = accountName;
        this.accountPassword = accountPassword;
        this.accountBalance = accountBalance;
    }

    public String getAccountName () {
        return this.accountName;
    }

    public String getAccountPassword () {
        return this.accountPassword;
    }

    public double getAccountBalance () {
        return this.accountBalance;
    }

    public void adjustAccountBalance (Double amount){
        this.accountBalance += amount;
    }

    public boolean checkAccountBalance (double amount){
        if (accountBalance >= amount) {
            return true;
        } else {
            return false;
        }
    }

}
