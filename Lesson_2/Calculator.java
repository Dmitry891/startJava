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