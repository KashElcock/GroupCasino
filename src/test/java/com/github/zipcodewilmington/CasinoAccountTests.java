package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.CasinoAccount;
import org.junit.Assert;
import org.junit.Test;

public class CasinoAccountTests {

    @Test
    public void casinoAccountContructorTest(){
        // given
        String name = "test";
        String password = "12345";
        // When
        CasinoAccount casinoAccount = new CasinoAccount(name, password);


        //then
        Assert.assertEquals(name, casinoAccount.getAccountName());
        Assert.assertEquals(password, casinoAccount.getAccountPassword());


    }

    @Test
    public void casinoAccountNullaryContructotTest(){
        //give
        //when
        CasinoAccount casinoAccount = new CasinoAccount();

        //then
        Assert.assertTrue(casinoAccount instanceof CasinoAccount);

    }

    @Test
    public void checkBalanceTest1(){
        // given
        // when
        CasinoAccount casinoAccount = new CasinoAccount();
        casinoAccount.accountBalance = 200;
        int amount = 100;
        Assert.assertTrue(casinoAccount.checkAccountBalance(amount));

    }
    @Test
    public void checkBalanceTest2(){
        // given
        // when
        CasinoAccount casinoAccount = new CasinoAccount();
        casinoAccount.accountBalance = 200;
        int amount = 300;
        Assert.assertFalse(casinoAccount.checkAccountBalance(amount));

    }

    @Test
    public void getAccountBalanceTest(){
        //give
        CasinoAccount casinoAccount = new CasinoAccount();
        double expectedAmount = 200;

        //when
        Assert.assertEquals(expectedAmount, casinoAccount.getAccountBalance() , 0.0f);

    }

    @Test
    public  void addAccountBalanceTest(){
        //give
        CasinoAccount casinoAccount = new CasinoAccount();
        double addedAmount = 100;
        double expectedAmount = 300;

        //when
        casinoAccount.addAccountBalance(addedAmount);

        //then
        Assert.assertEquals(expectedAmount, casinoAccount.getAccountBalance(), 0.0f);
    }

    @Test
    public  void subtractAccountBalanceTest(){
        //give
        CasinoAccount casinoAccount = new CasinoAccount();
        double subtractedAmount = 100;
        double expectedAmount = 100;

        //when
        casinoAccount.subtractAccountBalance(subtractedAmount);

        //then
        Assert.assertEquals(expectedAmount, casinoAccount.getAccountBalance(), 0.0f);

    }

}
