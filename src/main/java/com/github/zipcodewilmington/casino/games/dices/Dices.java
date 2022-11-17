package com.github.zipcodewilmington.casino.games.dices;

import java.util.Random;

public class Dices {
    public static Integer numberOfDice = 3;

    Random ran = new Random();
    public Dices(int numberOfDice){
        this.numberOfDice = numberOfDice;
    }

    public Integer tossAndSum(){
        Integer sum = 0 ;
        for(int i = 0; i < this.numberOfDice; i++){
            Integer randomNumber = ran.nextInt(6) + 1;

            sum += randomNumber;
        }
        return sum;
    }


}
