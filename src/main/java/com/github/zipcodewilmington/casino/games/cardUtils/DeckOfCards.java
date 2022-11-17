package com.github.zipcodewilmington.casino.games.cardUtils;

import java.util.Collections;
import java.util.Stack;

public class DeckOfCards {

    private static Stack<Cards> deck;

    public DeckOfCards() {
        deck = new Stack<>();

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

    public Stack<Cards> getDeck() {
        return deck;
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
}
