import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //generate a random number between 1 and 100
        int randomNumber = (int) ( Math.random()*100) +1;//casting 
        
        //prompt the user to guess a number between 1 and 100
        System.out.print("Enter a number between 1 and 100: ");
        int userGuess = in.nextInt(); //this reads user's input as an integer

        //check user's number to see if it is correct, too high, or too low
        //as long as user's number is incorrect
        while (userGuess != randomNumber) 
        {
           //display if it is too high or too low
        if(userGuess>randomNumber)  
            System.out.println("Too high!");
        else
            System.out.println("Too low!");
           //read next guess
        System.out.print("Enter another guess: ");
        userGuess = in.nextInt(); //this reads user's input as an integer
        }
        //display too high or too low...
        

        //you only get here when the user has the correct answer
        //display congratulations
        System.out.println("Congratulations!");

        in.close();
    }

    
}