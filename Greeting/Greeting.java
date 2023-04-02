import java.util.Scanner;

/**
 * Greeting
 */
public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine().toUpperCase();

        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
