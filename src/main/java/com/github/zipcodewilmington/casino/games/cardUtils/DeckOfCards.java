package com.github.zipcodewilmington.casino.games.cardUtils;

import java.util.Collections;
import java.util.Stack;

public class DeckOfCards {

    private static Stack<Cards> deck;

    public DeckOfCards() {
        deck = new Stack<>();

//        for (CardSuits cardSuits : CardSuits.values()){
//            for(CardRanks cardRanks : CardRanks.values()){
//                deck.push(new Cards(cardSuits, cardRanks));
//            }
//        }

        for (int i = 0; i < 4; i++){
            CardSuits suit = CardSuits.values()[i];
            for (int j = 0; j < 13; j++){
                CardRanks rank = CardRanks.values()[j];
                Cards card = new Cards(suit, rank);
                deck.add(card);
            }
        }
        shuffleDeckOfCards();
    }

    public void shuffleDeckOfCards() {
        Collections.shuffle(deck);
    }

    public String getDeck() {
        return deck.toString();
    }

    public Cards dealTopCard() {
        return deck.pop();
    }

    public int deckSize() {
        return deck.size();
    }

    public static boolean deckContains(Cards card) {
        return deck.contains(card);
    }

    public String toString() {
        String cardString = "";
        for (Cards card : deck) {
            cardString += card + " ";
        }
        return cardString;
    }
}
