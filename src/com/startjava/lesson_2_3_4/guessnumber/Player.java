package com.startjava.lesson_2_3_4.guessnumber;

public class Player {
    private String name;
    int[] attemptsOfPlayer1 = new int[10];
    int[] attemptsOfPlayer2 = new int[10];

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}