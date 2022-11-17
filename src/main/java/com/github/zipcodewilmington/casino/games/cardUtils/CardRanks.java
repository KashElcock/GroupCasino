package com.github.zipcodewilmington.casino.games.cardUtils;

public enum CardRanks {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13),
    ACE(14);

    private int cardRanks;

    CardRanks(int rank) {
        this.cardRanks = rank;
    }

    private void cardRanks(int rank){
        this.cardRanks = rank;
    }

    public int getCardRanks() {
        return cardRanks;
    }
}
