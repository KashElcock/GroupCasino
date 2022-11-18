import com.github.zipcodewilmington.casino.games.cardUtils.CardRanks;
import com.github.zipcodewilmington.casino.games.cardUtils.CardSuits;
import com.github.zipcodewilmington.casino.games.cardUtils.Cards;
import com.github.zipcodewilmington.casino.games.cardUtils.DeckOfCards;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DeckOfCardsTest {


//    @Test
//    public void getDeckTest() {
//        DeckOfCards deck = new DeckOfCards();
//        for (Cards card : deck) {
//            System.out.println(Cards.getRank() + " " + Cards.getSuit());
//        }
//    }

//    @Test
//    public void dealTopCardTest() {
//        DeckOfCards deck = new DeckOfCards();
//
//        Cards actual = deck.dealTopCard();
//
//        System.out.println(deck.dealTopCard());
//        Assert.assertFalse(DeckOfCards.deckContains(actual));
//    }

//    @Test
//    public void deckSizeTest() {
//        DeckOfCards deck = new DeckOfCards();
//
//        int expected = 52;
//
//        Assert.assertEquals(expected, deck.deckSize());
    //   }

    @Test
    public void shufflecardTest() {
        DeckOfCards deck = new DeckOfCards();

        deck.DeckOfCards();

        System.out.println(deck);
        //Assert.assertFalse(DeckOfCards.deckContains(actual))

    }

//    @Test
//    public void deckContainsTest() {
//        DeckOfCards deck = new DeckOfCards();
//        CardSuits suit = CardSuits.DIAMONDS;
//        CardRanks rank = CardRanks.NINE;
//        Cards card = new Cards(suit, rank);
//
//        Assert.assertTrue(DeckOfCards.deckContains(card));
//    }
}
