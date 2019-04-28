
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        System.out.println("Does Player 1 choose Rock, Paper, or Scissors?");
        String playerOne = keys.next();
        System.out.println("Does Player 2 choose Rock, Paper, or Scissors?");
        String playerTwo = keys.next();

        if ( (playerOne.equalsIgnoreCase("rock") && (playerTwo.equalsIgnoreCase("scissors"))) || (playerOne.equalsIgnoreCase("paper") && (playerTwo.equalsIgnoreCase("rock"))) || (playerOne.equalsIgnoreCase("scissors") && (playerTwo.equalsIgnoreCase("paper")))) {
            System.out.println("Player 1 Wins!");
        } else if ( (playerOne.equalsIgnoreCase("rock") && (playerTwo.equalsIgnoreCase("paper"))) || (playerOne.equalsIgnoreCase("paper") && (playerTwo.equalsIgnoreCase("scissors"))) || (playerOne.equalsIgnoreCase("scissors") && (playerTwo.equalsIgnoreCase("rock")))) {
            System.out.println("Player 2 Wins!");
        } else {
            System.out.println("Nobody Wins!");
        }


        }
}

        /*if (playerOne.equalsIgnoreCase("rock")) {
            if (playerTwo.equalsIgnoreCase("scissors")) {
                System.out.println("Player 1 Wins!");
            } else if (playerTwo.equalsIgnoreCase("paper")) {
                System.out.println("Player 2 Wins!");
            } else if (playerTwo.equalsIgnoreCase("rock")) {
                System.out.println("It's a Tie!");
            }
        }
        if (playerOne.equalsIgnoreCase("paper")) {
            if (playerTwo.equalsIgnoreCase("rock")) {
                System.out.println("Player 1 Wins!");
            } else if (playerTwo.equalsIgnoreCase("scissors")) {
                System.out.println("Player 2 Wins!");
            } else if (playerTwo.equalsIgnoreCase("paper")) {
                System.out.println("It's a Tie!");
            }
        }
        if (playerOne.equalsIgnoreCase("scissors")) {
            if (playerTwo.equalsIgnoreCase("paper")) {
                System.out.println("Player 1 Wins!");
            } else if (playerTwo.equalsIgnoreCase("rock")) {
                System.out.println("Player 2 Wins!");
            } else if (playerTwo.equalsIgnoreCase("scissors")) {
                System.out.println("It's a Tie!");
            }
        } */

