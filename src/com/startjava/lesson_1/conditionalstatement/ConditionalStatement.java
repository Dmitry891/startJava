package com.startjava.lesson_1.conditionalstatement

public class ConditionalStatement {   
    public static void main(String[] args) {
        byte age = 31;
        if (age > 20) { 
            System.out.println("Age is more than 20 years");
        }
        
        boolean maleGender = true;
        if (maleGender) {
            System.out.println("Person is a man");
        }
        if (!maleGender) {
            System.out.println("Person is a woman");
        }
        
        float height = 1.77f;
        if (height < 1.80) {
            System.out.println("Height is less than 1.80");
        } else {
            System.out.println("Height is more than 1.80");
        }
        
        char firstLetterOfName = 'D';
        if (firstLetterOfName == 'M') {
            System.out.println("M is not the first letter of a name");
        } else if (firstLetterOfName == 'I') {
            System.out.println("I is not the first letter of a name");
        } else {
            System.out.println("The first letter of a name is D");

        }
    }
}