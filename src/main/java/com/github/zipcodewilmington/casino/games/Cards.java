package com.github.zipcodewilmington.casino.games;

import javax.smartcardio.Card;

public class Cards {

    private CardSuits suit;
    private CardRanks rank;

    public Cards(CardSuits suit, CardRanks rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public void Cards(){
    }

    public void setSuit(CardSuits suit){
        this.suit = suit;
    }

    public CardSuits getSuit(){
        return suit;
    }

    public void setRank(CardRanks rank){
        this.rank = rank;
    }

    public CardRanks getRank() {
        return rank;
    }
}
