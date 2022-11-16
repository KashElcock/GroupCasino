package com.github.zipcodewilmington.casino.games;

public enum CardRanks {
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING,
    ACE;

    private int cardRanks;

    private void cardRanks(int rank){
        this.cardRanks = rank;
    }

    public int getCardRanks() {
        return cardRanks;
    }
}
