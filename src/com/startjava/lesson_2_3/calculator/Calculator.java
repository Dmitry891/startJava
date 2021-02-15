package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private String operation;
    private int result;

    void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    void setOperation(String operation) {
        this.operation = operation;
    }

    public int getResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите математическое выражение: ");
        String str = scanner.nextLine();
        String[] parts = str.split(" ");
        String firstSymbol= parts[0];
        String secondSymbol = parts[1];
        String thirdSymbol = parts[2];
        firstNumber = Integer.parseInt(parts[0]);
        secondNumber = Integer.parseInt(parts[2]);
        operation = parts[1];
        setFirstNumber(firstNumber);
        setOperation(operation);
        setSecondNumber(secondNumber);
        switch(operation) {
            case "+":
                result = Math.addExact(firstNumber, secondNumber);
                break;
            case "-":
                result = Math.subtractExact(firstNumber, secondNumber);
                break;
            case "*":
                result = Math.multiplyExact(firstNumber, secondNumber);
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "%":
                result = firstNumber % secondNumber;
                break;
            case "^":
                result = (int) Math.pow(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Вы ввели некорретную операцию!");
                break;
        }
         System.out.println("Результат вычислений: " + result);
         return result;
    }
}