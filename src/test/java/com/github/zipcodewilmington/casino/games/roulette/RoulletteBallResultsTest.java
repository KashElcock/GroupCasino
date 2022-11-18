package com.github.zipcodewilmington.casino.games.roulette;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoulletteBallResultsTest {

    @Test
    public void numberResultTest() {
        int expected = 36;
        RouletteBall results = new RouletteBall();

        results.setNumber(expected);
        Assert.assertEquals(expected, results.getNumber());
    }

    @Test
    void colorResultTest() {
        String expected = "Black";
        RouletteBall results = new RouletteBall();

        results.setColor(expected);
        Assert.assertEquals(expected, results.getColor());
    }

    @Test
    void evenOddResultTest() {
        boolean expected = false;
        RouletteBall results = new RouletteBall();

        results.setEven(expected);
        Assert.assertEquals(expected, results.isEven());
    }
}