package com.startjava.lesson_2_3.guessnumber;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name of first player: ");
        Player player1 = new Player(scanner.nextLine());
        System.out.print("Enter a name of second player: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String answer;
        do {
            game.start();
            do {
                System.out.println("Do you want to continue? [yes/no]");
                answer = scanner.nextLine();
            } while (!(answer.equals("yes") || answer.equals("no")));
        } while (answer.equals("yes"));
        System.out.println("Goodbye!");
    }
}