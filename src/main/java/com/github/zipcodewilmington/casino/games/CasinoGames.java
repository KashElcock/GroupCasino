package com.github.zipcodewilmington.casino.games;

public abstract class CasinoGames {

    public double getGameResult() {
        return gameResult;
    }

    public void setGameResult(double gameResult) {
        this.gameResult = gameResult;
    }

    private double gameResult;
}
