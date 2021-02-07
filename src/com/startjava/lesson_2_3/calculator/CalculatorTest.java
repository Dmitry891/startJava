package com.startjava.lesson_2_3.calculator
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator CalculatorSimple = new Calculator ();
        String answer;
        do {
        CalculatorSimple.getResult();
            do {
                System.out.println("Do you want to continue? [yes/no]");
                Scanner scan = new Scanner(System.in);
                answer = scan.nextLine();
            } while(!(answer.equals("yes") | answer.equals("no")));
        } while(answer.equals("yes"));
        System.out.println("Goodbye!");
    }
}