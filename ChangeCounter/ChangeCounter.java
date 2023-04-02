import java.util.Scanner;

/**
 * ChangeCounter
 */
public class ChangeCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompt user for numbers of quarters, dines, nickles and pennies
        System.out.print("How many quarters do you have? ");
        int quarters = scanner.nextInt();

        System.out.print("How many dines do you have? ");
        int dimes = scanner.nextInt();

        System.out.print("How many nickles do you have? ");
        int nickles = scanner.nextInt();

        System.out.print("How many pennies do you have? ");
        int pennies = scanner.nextInt();

        //calculate the total amount of change by adding quarters, dimes, nickles, and pennies
        double totalChange = (quarters * 0.25) + (dimes * 0.10) + (nickles * 0.05) + (pennies * 0.01);

        //display the total amount of change in dollars and cents
        System.out.printf("You have $%.2f", totalChange);
    }
}