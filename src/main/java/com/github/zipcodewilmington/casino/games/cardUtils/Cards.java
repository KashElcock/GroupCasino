package com.github.zipcodewilmington.casino.games.cardUtils;

public class Cards {

    private static CardSuits suit;
    private static CardRanks rank;

    public Cards(CardSuits suit, CardRanks rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Cards(){
    }

    public void setSuit(CardSuits suit){
        Cards.suit = suit;
    }

    public static CardSuits getSuit(){
        return suit;
    }

    public void setRank(CardRanks rank){
        Cards.rank = rank;
    }

    public static CardRanks getRank() {
        return rank;
    }

    public String toString() {
        return getRank().toString() + " of " + getSuit().toString();
    }
}
