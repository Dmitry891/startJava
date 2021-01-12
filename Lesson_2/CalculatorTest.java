import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator CalculatorSimple = new Calculator ();
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
        CalculatorSimple.setFirstNumber(firstNumber);
        CalculatorSimple.setOperation(operation);
        CalculatorSimple.setSecondNumber(secondNumber);
        CalculatorSimple.getResult();
        System.out.println("Do you want to continue? [yes/no]");
        String answer = scanner.nextLine();
            switch(answer) {
                case "yes":
                    System.out.println("Enter a first number: ");
                    break;
                case "no":
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Do you want to continue? [yes/no]");
                    break;
            }
    }
}