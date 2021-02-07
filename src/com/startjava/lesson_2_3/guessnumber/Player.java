package com.startjava.lesson_2_3.guessnumber

public class Player {
    private String name;

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