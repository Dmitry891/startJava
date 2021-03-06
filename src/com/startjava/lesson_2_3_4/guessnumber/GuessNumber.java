package com.startjava.lesson_2_3_4.guessnumber;

import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
    private Player player1;
    private Player player2;
    byte secretNumber = (byte) (Math.random() * 101);

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        System.out.println("У вас 10 попыток!");
        System.out.println("Компьютер загадал число" + " " + secretNumber);
        for(byte i = 0; i < 10; i++) {
            enterNumber(i, player1);
            if(checkAttempt(i, player1)) {
                break;
            }
            enterNumber(i, player2);
            if(checkAttempt(i, player2)) {
                break;
            }
            if(i == 9) {
                System.out.println("Уважемые игроки! Ваши попытки закончились! Никто не угадал число.");
                break;
            }
        }
        printPlayerAttempts(player1);
        System.out.println(" ");
        printPlayerAttempts(player2);
        System.out.println(" ");
        cleanNumbers(player1);
        cleanNumbers(player2);
    }

    private void enterNumber(byte i, Player player) {
        Scanner s = new Scanner(System.in);
        System.out.println(player.getName() + ", введите ваш вариант числа!");
        player.setAttempts(i, s.nextByte());
    }

    private boolean checkAttempt(byte i, Player player) {
        if(player.getAttempt(i) == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число с попытки № " + (i + 1));
            return true;
        } else if(player.getAttempt(i) > secretNumber) {
            System.out.println("Число, которое ввёл " + player.getName() + "," + " слишком большое");
            return false;
        } else if(player.getAttempt(i) < secretNumber) {
            System.out.println("Число, которое ввёл " + player.getName() + "," + " слишком маленькое");
            return false;
        }
        return true;
    }

    private void printPlayerAttempts(Player player) {
        System.out.println("Игрок " + player.getName() + " вводил следующие числа: ");
        for(byte i : player.getAttempts()) {
            System.out.print(i + " ");
        }
    }
    private void cleanNumbers(Player player) {
        for(byte i : player.getAttempts()) {
            Arrays.fill(player.getAttempts(), (byte) 0);
        }
    }
}