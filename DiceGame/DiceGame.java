/**
 * DiceGame
 */
public class DiceGame {

    public static void main(String[] args) {
        //create a program that simulates rolling a pair of dice and will give you the total of both die
        //Roll the first die
        int die1 = (int)(Math.random() * 6) + 1;
        System.out.println("The first roll is: " + die1);

        //roll the second die
        int die2 = (int)(Math.random() * 6) + 1;
        System.out.println("The second roll is: " + die2);

        //add both rolls up
        int total = die1 + die2;
        System.out.println("The total of both rolls is: " + total);
    }
}