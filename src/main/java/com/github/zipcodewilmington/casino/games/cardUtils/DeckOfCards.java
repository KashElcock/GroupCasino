package com.github.zipcodewilmington.casino.games.cardUtils;

import java.util.Collections;
import java.util.Stack;

public class DeckOfCards extends Stack<Cards> {

    private static Stack<Cards> deck;

    public DeckOfCards() {
        deck = new Stack<>();

        for (int i = 0; i < 4; i++){
            CardSuits suit = CardSuits.values()[i];
            for (int j = 0; j < 13; j++){
                CardRanks rank = CardRanks.values()[j];
                Cards card = new Cards(suit, rank);
                deck.push(card);
           }
       }
       shuffleDeckOfCards();
   }

   public void shuffleDeckOfCards() {
       Collections.shuffle(deck);
    }

   public void getDeck() {
        for (Cards card : deck) {
            System.out.println(Cards.getRank() + " " + Cards.getSuit());
       }
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

    public String deckToString() {
        String cardString = "";
       for (Cards card : deck) {
            cardString += card + " ";
        }
       return cardString;
   }
}


//import java.util.ArrayList;
//
//public class DeckOfCards {
//    public void DeckOfCards() {
//    }
//
//    public void shufflecard(){
//        String[] card_rank = new String[13];
//        for(int i= 1; i <card_rank.length; i++) {
//            if (i==1)
//                card_rank[i]="Ace";
//            else if(i==11)
//                card_rank[i]="Jack";
//            else if (i==12)
//                card_rank[i]="Queen";
//            else if(i==13) {
//                card_rank[i]="King";
//            } else
//                card_rank[i]=Integer.toString(i);
//            {
//                String[] card_suit = {"club", "Hearts", "Spades", "Diamonds"};
//                int len = 52;
//                String[] cards_deck = new String[len];
//                int rank_len = card_rank.length;
//                int suit_len = card_suit.length;
//                for (int x = 0; x <rank_len; x++) {
//                    for (int j = 0; j < suit_len; j++) {
//                        cards_deck[(suit_len) * x + j] = card_rank[x] + "of" + card_suit[j];
//                    }
//
//                }
//                for (int x = 0; x < len; x++) {
//                    int index = x + (int) (Math.random() * (len - x));
//                    String temp = cards_deck[index];
//                    cards_deck[index] = cards_deck[x];
//                    cards_deck[x] = temp;
//                }
//                for (int x = 0; x < len; x++) {
//                    System.out.println(cards_deck[x]);
//                }
//            }
//
//        }
//    }
//
//    //public static void deckContains(Cards actual) {
//}


