package com.startjava.lesson_2_3_4.guessnumber;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String answer;
        do {
            game.start();
            do {
                System.out.println("Желаете продолжить игру? [да/нет]");
                answer = scanner.nextLine();
            } while (!(answer.equals("да") || answer.equals("нет")));
        } while (answer.equals("да"));
        System.out.println("До свидания!");
    }
}