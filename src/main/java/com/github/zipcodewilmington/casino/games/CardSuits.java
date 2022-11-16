package com.github.zipcodewilmington.casino.games;

public enum CardSuits {

    HEARTS,
    DIAMONDS,
    CLUBS,
    SPADES;

    private int cardSuits;

    private void cardSuits(int suit){
        this.cardSuits = suit;
    }

    public int getCardSuits() {
        return cardSuits;
    }
}
