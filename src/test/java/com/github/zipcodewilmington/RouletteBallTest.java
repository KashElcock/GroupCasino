package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.games.roulette.RouletteBall;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RouletteBallTest {

    @Test
    void getNumber() {
        int expected = 12;
        RouletteBall ball = new RouletteBall(12, "", false);

        int actual = ball.getNumber();

        Assert.assertEquals(expected, actual);
    }

    @Test
    void getColor() {
        String expected = "Black";
        RouletteBall ball = new RouletteBall(0, "Black", false);

        String actual = ball.getColor();

        Assert.assertEquals(expected, actual);
    }

    @Test
    void isEven() {
        boolean expected = true;
        RouletteBall ball = new RouletteBall(0, "", true);

        boolean actual = ball.isEven();

        Assert.assertEquals(expected, actual);
    }
}