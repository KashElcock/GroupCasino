package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.CasinoAccountManager;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CasinoAccountManageerTests {

    @Test
    public void getAcountTest(){
        //give
        String name = "test1";
        String password = "012";
        CasinoAccountManager cam = new CasinoAccountManager();

        //when
        cam.createAccount(name, password);
        CasinoAccount tempCa = cam.getAccount(name, password);

        //then
        Assert.assertEquals(name, tempCa.getAccountName() );
        Assert.assertEquals(password, tempCa.getAccountPassword());
    }

    @Test
    public void createAccountTest(){
        //give
        String name = "test2";
        String password = "345";
        CasinoAccountManager cam = new CasinoAccountManager();

        //when
        cam.createAccount(name, password);
        CasinoAccount tempCa = cam.getAccount(name, password);

        //then
        Assert.assertEquals(name, tempCa.getAccountName() );
        Assert.assertEquals(password, tempCa.getAccountPassword());

    }

    @Test
    public void registerAccountTest(){
        //give
        String accountName = "test3";
        String accountPassword = "678";
        CasinoAccount newAccount = new CasinoAccount(accountName, accountPassword);
        CasinoAccountManager cam = new CasinoAccountManager();
        cam.registerAccount(newAccount);
        CasinoAccount tempAcc = cam.getAccount(accountName,accountPassword);
        Assert.assertEquals(accountName, tempAcc.getAccountName());
        Assert.assertEquals(accountPassword, tempAcc.getAccountPassword());

    }




}
