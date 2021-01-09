public class Calculator {   
    public static void main(String[] args) {
        /*
        Калькулятор выполняет математические операции (+, -, *, /, ^, %) над целыми положительными числами.
        Согласно условию задания, использовать Scanner запрещено, поэтому числа, над которыми
        нужно производить указанные выше операции, а также сама математическая операция задаются в ручную.
        По умолчанию стоит операция "^".
        */
        int firstNumber = 6;
        int secondNumber = 2;
        char operation = '^';
        int result = 0;
        if (operation == '+') {
            result = firstNumber + secondNumber;
        } else if (operation == '-') {
            result = firstNumber - secondNumber;
        } else if (operation == '*') {
            result = firstNumber * secondNumber;
        } else if (operation == '/') {
            result = firstNumber / secondNumber;
        } else if (operation == '%') {
            result = firstNumber % secondNumber;
        } else if (operation == '^') {
            result = 1;
            for (int i = 1; i <= secondNumber; i++) {
                result *= firstNumber;
            }
        } else {
            System.out.println("Incorrect operation");
        }
        System.out.println(firstNumber + " ^ " + secondNumber + " = " + result);
    }
}