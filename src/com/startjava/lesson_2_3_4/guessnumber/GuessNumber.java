package com.startjava.lesson_2_3_4.guessnumber;

import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private byte secretNumber;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        System.out.println("У вас 10 попыток!");
        secretNumber = (byte) (Math.random() * 101);
        System.out.println("Компьютер загадал число" + " " + secretNumber);
        byte i;
        for(i = 0; i < 10; i++) {
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
        printPlayerAttempts(player1, i);
        System.out.println(" ");
        printPlayerAttempts(player2, i);
        System.out.println(" ");
        player1.cleanAttempts(i);
        player2.cleanAttempts(i);
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

    private void printPlayerAttempts(Player player, byte i) {
        System.out.println("Игрок " + player.getName() + " вводил следующие числа: ");
        for(byte number : player.getAttempts((byte) (i + 1))) {
            System.out.print(number + " ");
        }
    }
}