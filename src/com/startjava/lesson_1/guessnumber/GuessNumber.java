package com.startjava.lesson_1.guessnumber

public class GuessNumber {   
    public static void main(String[] args) {
        /*Согласно условию задания, использовать Scanner запрещено, поэтому число которое
        загадал компьютер и число которое первый раз назвал игрок, задаются в ручную в диапазоне (0...100]. 
        Предполагается, что игрок каждый раз увеличивает или уменьшает свой вариант на 1.
        */
        byte numberOfPC = 26;
        byte numberOfUser = 27;
        if (numberOfUser > numberOfPC) {
            while (numberOfUser != numberOfPC) {
                System.out.println("Your number is too big. Try again!");
                numberOfUser--;
            }
        } else if (numberOfUser < numberOfPC) {
            while (numberOfUser != numberOfPC) {
                System.out.println("Your number is too small. Try again!");
                numberOfUser++;
            }
        }
        System.out.println("Congratulations! You've guessed the number! Number is " + numberOfUser + "!");
    }
}