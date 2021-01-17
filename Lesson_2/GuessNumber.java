import java.util.Random;

public class GuessNumber {   
    public void startGame() {
        System.out.println("Let's play!");
        Player player1 = new Player();
        Player player2 = new Player();
        int numberOfPC = (byte) (Math.random() * 101);
        player1.name();
        String name1 = player1.nameOfPlayer;
        System.out.println("Name of first player is " + name1);
        player2.name();
        String name2 = player2.nameOfPlayer;
        System.out.println("Name of second player is " + name2);
        System.out.println("PC says: \"I've guessed the number from 1 to 100\" " + "(" + numberOfPC + ")");
            while (true) {
                player1.guess();
                int number1 = player1.numberOfPlayer;
                player2.guess();
                int number2 = player2.numberOfPlayer;
                if (number1 == numberOfPC) {
                    System.out.println(name1 + " is winner!");
                    break;
                } else if (number2 == numberOfPC) {
                    System.out.println(name2 + " is winner!");
                    break;
                } else {
                    System.out.println("Players must try again!");
                }
            }
        }
    }