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

    public void setAttempt(byte i, byte attempt) {
        attempts[i] = attempt;
    }

    public byte getAttempt(byte i) {
        //byte number = attempts[i];
        return attempts[i];
    }

    public byte[] getAttempts(byte i) {
        return Arrays.copyOf(attempts, i);
    }

    public void cleanAttempts(byte i) {
        Arrays.fill(attempts, (byte) 0);
    }
}