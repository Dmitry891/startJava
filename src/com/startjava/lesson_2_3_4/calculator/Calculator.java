package com.startjava.lesson_2_3_4.calculator;

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

    public int calculate() {
        switch(operation) {
            case "+":
                return Math.addExact(firstNumber, secondNumber);
            case "-":
                return Math.subtractExact(firstNumber, secondNumber);
            case "*":
                return Math.multiplyExact(firstNumber, secondNumber);
            case "/":
                return (firstNumber / secondNumber);
            case "%":
                return (firstNumber % secondNumber);
            case "^":
                return ((int) Math.pow(firstNumber, secondNumber));
            default:
                System.out.println("Вы ввели некорретную операцию!");
        }
         return 0;
    }
}