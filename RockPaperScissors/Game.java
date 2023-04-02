import java.util.Scanner;

//have the computer generate a random value
//have the user declare Rock, Paper, or Scissors
//display the user's and computer's results

/**
 * Game
 */
public class Game {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //read user's guess/value
        System.out.println("Please enter rock, paper, or scissors: ");
        String userGuess = in.nextLine().toLowerCase();

        //generate computer's guess/value
        String[] values = {"rock", "paper", "scissors"}; //index 0,1,2
        String computerGuess = values [(int) (Math.random()*3) ];

        //decide a winner
        if(userGuess.equals(computerGuess))
        {
        System.out.println("Draw!" + "computer guess: " + computerGuess);
        }
        //computer winning combinations
        else if((computerGuess.equals("scissors") && userGuess.equals("paper"))
                ||
                (computerGuess.equals("paper") && userGuess.equals("rock"))
                ||
                (computerGuess.equals("rock") && userGuess.equals("scissors")))
        {
            System.out.println("You lose! " + "computer choice: " + computerGuess);
        }
        else{
            System.out.println("You won! " + "computer choice: " + computerGuess);
        }

        in.close();

    }
}