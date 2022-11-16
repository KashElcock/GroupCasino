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
        String password = "12345";
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
        String name = "test1";
        String password = "12345";
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
        CasinoAccountManager cam = new CasinoAccountManager();
    }


}
