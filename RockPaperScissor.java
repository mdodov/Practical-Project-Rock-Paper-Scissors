import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");

        String playerMove = scanner.nextLine();

        String rock = "Rock";
        String paper = "Paper";
        String scissors = "Scissors";

        if (playerMove.equals("r")) {

            playerMove = rock;

        } else if (playerMove.equals("p")) {

            playerMove = paper;

        } else if (playerMove.equals("s")) {

            playerMove = scissors;

        } else {

            System.out.println("Invalid Input. Try Again...");

            return;

        }

        Random random = new Random();

        int computer = random.nextInt(3);

        String computerMove = "";

        switch (computer) {

            case 0:

                computerMove = rock;

                break;

            case 1:

                computerMove = paper;

                break;

            case 2:

                computerMove = scissors;

                break;

        }

        System.out.printf("The computer chose %s%n", computerMove);

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) || (playerMove.equals("Paper") && computerMove.equals("Rock")) || (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {

            System.out.println("You win.");

        } else if ((computerMove.equals("Rock") && playerMove.equals("Scissors")) || (computerMove.equals("Paper") && playerMove.equals("Rock")) || (computerMove.equals("Scissors") && playerMove.equals("Paper"))) {

            System.out.println("You lose.");

        } else {

            System.out.println("This game was a draw.");

        }

    }

}
