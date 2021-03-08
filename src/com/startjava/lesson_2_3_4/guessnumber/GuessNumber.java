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
        byte lastAttempt = 0;
        for(byte i = 0; i < 10; i++) {
            enterNumber(i, player1);
            if(checkAttempt(i, player1)) {
                lastAttempt = i;
                break;
            }
            enterNumber(i, player2);
            if(checkAttempt(i, player2)) {
                lastAttempt = i;
                break;
            }
            if(i == 9) {
                System.out.println("Уважемые игроки! Ваши попытки закончились! Никто не угадал число.");
                lastAttempt = i;
                break;
            }
        }
        printPlayerAttempts(player1, lastAttempt);
        System.out.println(" ");
        printPlayerAttempts(player2, lastAttempt);
        System.out.println(" ");
        player1.cleanAttempts(player1, lastAttempt);
        player2.cleanAttempts(player2, lastAttempt);
    }

    private void enterNumber(byte i, Player player) {
        Scanner s = new Scanner(System.in);
        System.out.println(player.getName() + ", введите ваш вариант числа!");
        player.setAttempt(i, s.nextByte());
    }

    private boolean checkAttempt(byte i, Player player) {
        if(player.getAttempt(i) == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число с попытки № " + (i + 1));
            return true;
        } else if(player.getAttempt(i) > secretNumber) {
            System.out.println("Число, которое ввёл " + player.getName() + "," + " слишком большое");
        } else if(player.getAttempt(i) < secretNumber) {
            System.out.println("Число, которое ввёл " + player.getName() + "," + " слишком маленькое");
        }
        return false;
    }

    private void printPlayerAttempts(Player player, byte lastAttempt) {
        System.out.println("Игрок " + player.getName() + " вводил следующие числа: ");
        for(byte number : player.getAttempts((byte) (lastAttempt + 1))) {
            System.out.print(number + " ");
        }
    }
}