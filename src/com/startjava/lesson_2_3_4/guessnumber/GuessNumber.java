package com.startjava.lesson_2_3_4.guessnumber;

import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
    private Player player1;
    private Player player2;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void checkAttempt(byte i, byte attempt, byte secretNumber, String name ) {
        if (attempt == secretNumber) {
            System.out.println("Игрок " + player1.getName() + " угадал число с попытки № " + (i + 1));
        } else if (attempt > secretNumber) {
            System.out.println("Число, которое ввёл " + name + "," + " слишком большое");
        } else if (attempt < secretNumber) {
            System.out.println("Число, которое ввёл " + name + "," + " слишком маленькое");
        }
    }

    public void printPlayerAttempts(byte i, String name ){
        byte[] copy1 = Arrays.copyOf(player1.getAttemptsOfPlayer(), i);
        System.out.println(name + " вводил следующие числа: ");
        for (i = 0; i < copy1.length; i++) {
            System.out.print(copy1[i] + " ");
        }
        Arrays.fill(copy1, (byte) 0);
    }

    public void start() {
        String name;
        System.out.println("У вас 10 попыток!");
        byte secretNumber = (byte) (Math.random() * 101);
        System.out.println("Компьютер загадал число" + " " + secretNumber);
        Scanner s = new Scanner(System.in);
        for (byte i = 0; i < 10; i++) {
            System.out.println(player1.getName() + ", введите ваш вариант числа!");
            byte attempt = s.nextByte();
            player1.setAttemptsOfPlayer(i, attempt);
            checkAttempt(i, attempt, secretNumber, player1.getName());
            if (attempt == secretNumber) {
                break;
            }
            System.out.println(player2.getName() + ", введите ваш вариант числа!");
            attempt = s.nextByte();
            player2.setAttemptsOfPlayer(i, attempt);
            checkAttempt(i, attempt, secretNumber, player2.getName());
            if (attempt == secretNumber) {
                break;
            }
            if (i == 9) {
                System.out.println("Уважемые игроки! Ваши попытки закончились! Никто не угадал число.");
                break;
            }
        }
        printPlayerAttempts(, player1.getName());
        System.out.println(" ");
        printPlayerAttempts(, player2.getName());
        System.out.println(" ");
    }
}