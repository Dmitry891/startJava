public class Calculator {   
    public static void main(String[] args) {
        /*
        Калькулятор выполняет математические операции (+, -, *, /, ^, %) над целыми положительными числами.
        Согласно условию задания, использовать Scanner запрещено, поэтому числа, над которыми
        нужно производить указанные выше операции, а также сама математическая операция задаются в ручную.
        По умолчанию стоит операция "^".
        */
        long firstNumber = 2;
        long secondNumber = 6;
        char operation = '^';

        if (operation == '+') {
            long result = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + result);
        } else if (operation == '-') {
            long result = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber + " = " + result);
        } else if (operation == '*') {
            long result = firstNumber * secondNumber;
            System.out.println(firstNumber + " * " + secondNumber + " = " + result);
        } else if (operation == '/') {
            long result = firstNumber / secondNumber;
            System.out.println(firstNumber + " / " + secondNumber + " = " + result);
        } else if (operation == '%') {
            long result = firstNumber % secondNumber;
            System.out.println(firstNumber + " % " + secondNumber + " = " + result);
        } else if (operation == '^') {
            long power = 1;
            for (long i = 1; i<=secondNumber; i++) {
                power = power * firstNumber;
            }
            System.out.println(firstNumber + " ^ " + secondNumber + " = " + power);
        }
        else {
            System.out.println("Incorrect operation");
        }
    }
}