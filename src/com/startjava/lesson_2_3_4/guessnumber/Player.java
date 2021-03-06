package com.startjava.lesson_2_3_4.guessnumber;

import java.util.Arrays;

public class Player {
    private String name;
    private byte[] attempts = new byte[10];

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public void setAttempts(byte i, byte attempt) {
        attempts[i] = attempt;
    }
    public byte getAttempt(byte i) {
        byte number = attempts[i];
        return number;
    }

    public byte[] getAttempts() {
        byte[] copy1 = Arrays.copyOf(attempts, attempts.length);
        return copy1;
    }
}