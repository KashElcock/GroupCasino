package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.games.cardUtils.CardRanks;
import com.github.zipcodewilmington.casino.games.cardUtils.CardSuits;
import com.github.zipcodewilmington.casino.games.cardUtils.Cards;
import org.junit.Assert;
import org.junit.Test;

public class CardTest {

    @Test
    public void cardsConstructorTest() {
        //Given
        CardSuits suit = CardSuits.HEARTS;
        CardRanks rank = CardRanks.ACE;

        //When
        Cards cards = new Cards(suit, rank);

        //Then
        Assert.assertEquals(suit, Cards.getSuit());
        Assert.assertEquals(rank, Cards.getRank());
    }

    @Test
    public void cardsNullaryConstructorTest() {
        //Given
        Cards card = new Cards();

        //Then
        Assert.assertTrue(card instanceof Cards);
    }

    @Test
    public void getSuitTest() {
        //Given
        CardSuits suit = CardSuits.SPADES;
        CardRanks rank = CardRanks.EIGHT;

        //When
        Cards card = new Cards(suit, rank);

        //Then
        Assert.assertEquals(suit, Cards.getSuit());
    }

    @Test
    public void getRankTest() {
        //Given
        CardSuits suit = CardSuits.DIAMONDS;
        CardRanks rank = CardRanks.NINE;

        //When
        Cards card = new Cards(suit, rank);

        //Then
        Assert.assertEquals(rank, Cards.getRank());
    }
}
