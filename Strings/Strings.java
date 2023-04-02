import java.util.Scanner;

//examples of string uaage in Java 

public class Strings {

    public static void main(String[] args) {
        // //assign a student name and GPA Variable
        // String studentName = "Brandon";
        // double studentGPA = 1.90;
        // //change the student name
        // studentName = "Brandy";

        Scanner in = new Scanner(System.in);
        //ask the user for a positive value
        System.out.println("Ente a positive number");
        double userNumber = in.nextDouble();
        if(userNumber > 0)
        {
            //display square root of number
            System.out.println(Math.sqrt(userNumber));
        }
        else System.out.println("Error: The number is not positive!");


        in.close();



    }
}