package com.startjava.lesson_2_3_4.guessnumber;

public class Player {
    private String name;
    private byte[] attemptsOfPlayer = new byte[10];

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public void setAttemptsOfPlayer(byte i, byte attempt) {
            attemptsOfPlayer[i] = attempt;
    }

    public byte[] getAttemptsOfPlayer() {
        return attemptsOfPlayer;
    }
}