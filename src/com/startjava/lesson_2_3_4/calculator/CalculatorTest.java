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
            String firstSymbol= parts[0];
            String secondSymbol = parts[1];
            String thirdSymbol = parts[2];
            int firstNumber = Integer.parseInt(parts[0]);
            int secondNumber = Integer.parseInt(parts[2]);
            String operation = parts[1];
            calc.setFirstNumber(firstNumber);
            calc.setOperation(operation);
            calc.setSecondNumber(secondNumber);
            int result = calc.calculate();
            System.out.println("Результат вычислений: " + result);
            do {
                System.out.println("Желаете продолжить? [да/нет]");
                answer = scan.nextLine();
            } while(!(answer.equals("да") || answer.equals("нет")));
        } while(answer.equals("да"));
        System.out.println("До свидания!");
    }
}