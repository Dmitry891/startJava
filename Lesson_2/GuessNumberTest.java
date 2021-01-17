import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        GuessNumber playGame = new GuessNumber();
        playGame.startGame();
        System.out.println("Do you want to continue? [yes/no]");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch(answer) {
            case "yes":
                playGame.startGame();
            case "no":
                System.out.println("Goodbye!");
                    break;
            default:
                System.out.println("Do you want to continue? [yes/no]");
                    break;
        }
    }
}