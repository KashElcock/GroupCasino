package com.github.zipcodewilmington.casino;

import com.github.zipcodewilmington.Casino;

import java.util.ArrayList;
import java.util.List;

///**
// * Created by leon on 7/21/2020.
// * `ArcadeAccountManager` stores, manages, and retrieves `ArcadeAccount` objects
// * it is advised that every instruction in this class is logged
// */
public class CasinoAccountManager {
    List<CasinoAccount> casinoAccountList = new ArrayList<>();
//    /**
//     * @param accountName     name of account to be returned
//     * @param accountPassword password of account to be returned
//     * @return `ArcadeAccount` with specified `accountName` and `accountPassword`
//     */
    public CasinoAccount getAccount(String accountName, String accountPassword) {

        for (CasinoAccount casinoAccount : casinoAccountList){
            if (accountName.equals(casinoAccount.getAccountName())
                    && accountPassword.equals(casinoAccount.getAccountPassword())){
                return casinoAccount;
            }
            else {
                System.out.println("Invalid account username and password. Please try again!");
            }
        }
        return null;
//        String currentMethodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        String currentClassName = getClass().getName();
//        String errorMessage = "Method with name [ %s ], defined in class with name [ %s ] has  not yet been implemented";
//        throw new RuntimeException(String.format(errorMessage, currentMethodName, currentClassName));
    }

//    /**
//     * logs & creates a new `ArcadeAccount`
//     *
//     * @param accountName     name of account to be created
//     * @param accountPassword password of account to be created
//     * @return new instance of `ArcadeAccount` with specified `accountName` and `accountPassword`
//     */
    public CasinoAccount createAccount(String accountName, String accountPassword) {

        CasinoAccount newAccount = new CasinoAccount(accountName, accountPassword);
        registerAccount(newAccount);
        return newAccount;

//        String currentMethodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        String currentClassName = getClass().getName();
//        String errorMessage = "Method with name [ %s ], defined in class with name [ %s ] has  not yet been implemented";
//        throw new RuntimeException(String.format(errorMessage, currentMethodName, currentClassName));
    }

//    /**
//     * logs & registers a new `ArcadeAccount` to `this.getArcadeAccountList()`
//     *
//     * @param casinoAccount the arcadeAccount to be added to `this.getArcadeAccountList()`
//     */
    public List<CasinoAccount> registerAccount(CasinoAccount newAccount) {

        this.casinoAccountList.add(newAccount);
        //System.out.println(casinoAccountList);
        return this.casinoAccountList;
//        String currentMethodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        String currentClassName = getClass().getName();
//        String errorMessage = "Method with name [ %s ], defined in class with name [ %s ] has  not yet been implemented";
//        throw new RuntimeException(String.format(errorMessage, currentMethodName, currentClassName));
    }
}
