package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator CalculatorSimple = new Calculator ();
        String answer;
        do {
        CalculatorSimple.getResult();
            do {
                System.out.println("Желаете продолжить? [да/нет]");
                Scanner scan = new Scanner(System.in);
                answer = scan.nextLine();
            } while(!(answer.equals("да") | answer.equals("нет")));
        } while(answer.equals("да"));
        System.out.println("До свидания!");
    }
}