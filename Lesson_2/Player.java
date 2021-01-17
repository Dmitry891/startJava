import java.util.Scanner;

public class Player {
    String nameOfPlayer;
    byte numberOfPlayer;

    public void name() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        nameOfPlayer = scanner.nextLine();
    }

    public void guess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        numberOfPlayer = scanner.nextByte();
        System.out.println(nameOfPlayer + " says: \"I've guessed " + numberOfPlayer + "\"");
    }
}