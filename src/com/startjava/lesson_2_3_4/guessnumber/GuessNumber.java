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

    public void start() {
        System.out.println("У вас 10 попыток!");
        int numberOfPC = (byte) (Math.random() * 101);
        System.out.println("Компьютер загадал число" + " " + numberOfPC);
        Scanner s = new Scanner(System.in);
        int lastAttemptPlayer1 = 0;
        int lastAttemptPlayer2 = 0;
        while (true) {
            for (int i = 0; i < 10; i = i + 1) {
                System.out.println(player1.getName() + ", введите ваш вариант числа!");
                player1.attemptsOfPlayer1[i] = s.nextInt();
                System.out.println(player2.getName() + ", введите ваш вариант числа!");
                player2.attemptsOfPlayer2[i] = s.nextInt();
                if (player1.attemptsOfPlayer1[i] == numberOfPC) {
                    lastAttemptPlayer1 = i;
                    lastAttemptPlayer2 = i;
                    System.out.println("Игрок " + player1.getName() + " угадал число с попытки № " + (i + 1));
                    break;
                } else if(player1.attemptsOfPlayer1[i] > numberOfPC) {
                    System.out.println("Число, которое ввёл " + player1.getName() + "," + " слишком большое");
                } else if(player1.attemptsOfPlayer1[i] < numberOfPC) {
                    System.out.println("Число, которое ввёл " + player1.getName() + "," + " слишком маленькое");
                }
                if (player2.attemptsOfPlayer2[i] == numberOfPC) {
                    lastAttemptPlayer2 = i;
                    lastAttemptPlayer1 = i;
                    System.out.println("Игрок " + player2.getName() + " угадал число с попытки № " + (i + 1));
                    break;
                } else if(player2.attemptsOfPlayer2[i] > numberOfPC) {
                    System.out.println("Число, которое ввёл " + player2.getName() + "," + " слишком большое");
                } else if(player2.attemptsOfPlayer2[i] < numberOfPC) {
                    System.out.println("Число, которое ввёл " + player2.getName() + "," + " слишком маленькое");
                }
                if (i == 9) {
                    System.out.println("Уважемые игроки! Ваши попытки закончились! Никто не угадал число.");
                    break;
                }
            }
            for (int i = 0; i < player1.attemptsOfPlayer1.length; i = i + 1) {
                System.out.print(player1.attemptsOfPlayer1[i] + " ");
            }
            System.out.println(" ");
            for (int i = 0; i < player2.attemptsOfPlayer2.length; i = i + 1) {
                System.out.print(player2.attemptsOfPlayer2[i] + " ");
            }
            System.out.println(" ");
            int[] copy1 = Arrays.copyOf(player1.attemptsOfPlayer1, lastAttemptPlayer1 + 1);
            int[] copy2 = Arrays.copyOf(player2.attemptsOfPlayer2, lastAttemptPlayer1 + 1);
            System.out.println(player1.getName() + " вводил следующие числа: ");
            for (int k = 0; k < copy1.length; k = k + 1) {
                System.out.print(copy1[k] + " ");
            }
            System.out.println(" ");
            System.out.println(player2.getName() + " вводил следующие числа: ");
            for (int j = 0; j < copy2.length; j = j + 1) {
                System.out.print(copy2[j] + " ");
            }
            System.out.println(" ");
            Arrays.fill(copy1, 0);
            Arrays.fill(copy2, 0);
            break;
        }
    }
}
//        for (int i = 0; i < attemptsOfPlayer1.length; i = i + 1) {
//        System.out.print(attemptsOfPlayer1[i] + " ");
//        }
//        System.out.println(" ");
//        for (int i = 0; i < attemptsOfPlayer2.length; i = i + 1) {
//        System.out.print(attemptsOfPlayer2[i] + " ");
//        }
//        System.out.println(" ");
//        int[] copy1 = Arrays.copyOf(attemptsOfPlayer1, lastAttemptPlayer1 + 1);
//        int[] copy2 = Arrays.copyOf(attemptsOfPlayer2, lastAttemptPlayer2 + 1);
//
//        for (int k = 0; k < copy1.length; k = k + 1) {
//        System.out.print(copy1[k] + " ");
//        }
//        System.out.println(" ");
//        for (int j = 0; j < copy2.length; j = j + 1) {
//        System.out.print(copy2[j] + " ");
//        }
//
//    public void start() {
//        System.out.println("У вас 10 попыток!");
//        int numberOfPC = (byte) (Math.random() * 101);
//        System.out.println("PC says: \"I've gueesed the number\"" + " " + numberOfPC);
//        Scanner s = new Scanner(System.in);
//        while (true) {
//            System.out.println(player1.getName() + ", enter the number!");
//            byte numberOfPlayer1 = s.nextByte();
//            if(numberOfPlayer1 == numberOfPC) {
//                System.out.println("Winner is " + player1.getName());
//                break;
//            } else if(numberOfPlayer1 > numberOfPC) {
//                System.out.println("Number of " + player1.getName() + " is too big");
//            } else if(numberOfPlayer1 < numberOfPC) {
//                System.out.println("Number of " + player1.getName() + " is too small");
//            }
//            System.out.println(player2.getName() + ", enter the number!");
//            byte numberOfPlayer2 = s.nextByte();
//            if(numberOfPlayer2 == numberOfPC) {
//                System.out.println("Winner is " + player2.getName());
//                break;
//            } else if(numberOfPlayer2 > numberOfPC) {
//                System.out.println("Number of " + player2.getName() + " is too big");
//            } else if(numberOfPlayer2 < numberOfPC) {
//                System.out.println("Number of " + player2.getName() + " is too small");
//            }
//            System.out.println("Players must try again!");
//        }
//    }