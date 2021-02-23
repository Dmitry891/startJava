package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Введите математическое выражение: ");
            String str = scan.nextLine();
            String[] parts = str.split(" ");
            int firstNumber = Integer.parseInt(parts[0]);
            int secondNumber = Integer.parseInt(parts[2]);
            String operation = parts[1];
            calc.setFirstNumber(firstNumber);
            calc.setOperation(operation);
            calc.setSecondNumber(secondNumber);
            System.out.println("Результат вычислений: " + calc.calculate());
            do {
                System.out.println("Желаете продолжить? [да/нет]");
                answer = scan.nextLine();
            } while(!(answer.equals("да") || answer.equals("нет")));
        } while(answer.equals("да"));
        System.out.println("До свидания!");
    }
}