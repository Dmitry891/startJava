package com.startjava.lesson_2_3.calculator
import java.util.Scanner;

public class Calculator {   

    private int firstNumber;
    private int secondNumber;
    private char operation;
    private int result;

    void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    void setOperation(char operation) {
        this.operation = operation;
    }

    public int getResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int firstNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter an operation ( + , - , * , / , % , ^ ): ");
        char operation = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.print("Enter a second number: ");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();
        setFirstNumber(firstNumber);
        setOperation(operation);
        setSecondNumber(secondNumber);
        switch(operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
            case '^':
                result = 1;
                    for (int i = 1; i <= secondNumber; i++) {
                        result *= firstNumber;
                    }
                break;
            default:
                System.out.println("You've entered an invalid operation!");
                break;
        }
         System.out.println("Result is " + result);
         return result;
    }
}