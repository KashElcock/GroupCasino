package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.games.dices.Dices;
import org.junit.Assert;
import org.junit.Test;

public class DiceTest {
    @Test
    public void diceTest(){
        Dices dc = new Dices();
        int expected = 0;
        int actual = dc.tossAndSum();
        Assert.assertNotEquals( expected, actual);
    }
}
