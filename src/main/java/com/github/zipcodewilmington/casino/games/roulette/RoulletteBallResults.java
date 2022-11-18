package com.github.zipcodewilmington.casino.games.roulette;

import java.util.Arrays;
import java.util.Random;

public class RoulletteBallResults extends RouletteBall {

    int[] red = {1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36};
    //int[] black = {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};

    public RoulletteBallResults() {

    }

    public RoulletteBallResults(int number, String color, boolean even) {
        super(number, color, even);
    }

    public RouletteBall results() {
        RouletteBall results = new RouletteBall();

        Random rand = new Random();
        int numberResult = rand.nextInt(38); //int 00 == int 37

        results.setNumber(numberResult);
        results.setColor(colorResult(numberResult));
        results.setEven(evenOddResult(numberResult));
        return results;
    }

    public String colorResult(int wheelSpinOutcome){
        String checker = Arrays.toString(red);
        String color = null;

        if (wheelSpinOutcome == 0 || wheelSpinOutcome == 37) {
            color = "Green" + " " + wheelSpinOutcome + "\n";
        }
        else if (checker.contains(Integer.toString(wheelSpinOutcome))) {
            color = "Red" + " " + wheelSpinOutcome + "\n";
        }
        else
            color = "Black" + " " + wheelSpinOutcome + "\n";
        return color;
    }

    public boolean evenOddResult(int wheelSpinOutcome){
        boolean even;

        if (wheelSpinOutcome == 0 || wheelSpinOutcome == 37){
            even = false;
        }
        else if (wheelSpinOutcome % 2 == 0) {
            even = true;
        }
        else
            even = false;
        return even;
    }
}
