import java.util.*;
public class OddsOrEvens {
    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        Boolean playAgain = true;
        while (playAgain) {
            System.out.println("Let's play a game called \"Odds and Evens\"!");
            System.out.println("What is your name?");
            String name = keys.next();
            System.out.println("Hi " + name + ", Which do you choose? (O)dds or (E)vens?");
            String choice = keys.next();
            if ((choice.equalsIgnoreCase("E")) || (choice.equalsIgnoreCase("evens")) || (choice.equalsIgnoreCase("even"))) {
                System.out.println(name + " has picked evens! The computer will be odds.");
                choice = ("E");
            } else if ((choice.equalsIgnoreCase("o")) || (choice.equalsIgnoreCase("odds")) || (choice.equalsIgnoreCase("odd"))) {
                System.out.println(name + " has picked odds! The computer will be evens.");
                choice = ("O");
            }
            System.out.println("---------------------------");
            System.out.println("How many \"fingers\" do you want to play?");
            int userNumber = keys.nextInt();
            while ((userNumber > 5)||(userNumber < 0)) {
                System.out.println("Please choose a number from 1-5!");
                userNumber = keys.nextInt();
            }
            Random rand = new Random();
            int computerNumber = rand.nextInt(6);
            System.out.println("The computer plays " + computerNumber + " \"fingers\".");
            System.out.println("---------------------------");
            int answer = (userNumber + computerNumber);
            System.out.println(userNumber + " + " + computerNumber + " = " + answer);
            if (answer % 2 == 0) {
                System.out.println("The sum " + "(" + answer + ")" + " is... even!");
                if (choice.equals("E")) {
                    System.out.println(name + " Wins!");
                } else {
                    System.out.println("The computer wins!");
                }
            } else {
                System.out.println("The sum " + "(" + answer + ")" + " is... odd!");
                if (choice.equals("O")) {
                    System.out.println(name + " Wins!");
                } else {
                    System.out.println("The computer wins!");
                }
            }
            System.out.println("Would you like to play again?");
            String askPlay = keys.next();
            while (!askPlay.equalsIgnoreCase("yes") && (!askPlay.equalsIgnoreCase("no"))) {
                System.out.println("Please answer either yes or no!");
                askPlay = keys.next();
            }
            if (askPlay.equalsIgnoreCase("no")) {
                playAgain = false;
            }
        }
    }
}

