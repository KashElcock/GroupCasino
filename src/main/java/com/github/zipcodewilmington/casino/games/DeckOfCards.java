package com.github.zipcodewilmington.casino.games;

import java.util.Collections;
import java.util.Stack;

public class DeckOfCards {

    private Stack<Cards> deck;

    public DeckOfCards() {
        this.deck = new Stack<>();

        for (int i = 0; i < 13; i++){
            CardRanks rank = CardRanks.values()[i];
            for (int j = 0; j < 4; j++){
                CardSuits suit = CardSuits.values()[j];
                Cards card = new Cards(suit, rank);
                this.deck.add(card);
            }
        }
        this.shuffleDeckOfCards();
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

    public boolean deckContains(Cards card) {
        return deck.contains(card);
    }
}
