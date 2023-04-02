import java.util.Scanner;

/**
 * Welcome
 */
public class Welcome {

    public static void main(String[] args) {
//         System.out.println("Brandon Hamlyn");
//         System.out.println("Seoul, Korea" + " and " + "Honolulu, Hawaii");
//         System.out.println("Salary: $" + 150_000);

//         double salary = 100000;
//         //create a variable that can store a password
//         String password = "password123";

//         //create a variable that can store pi
//         double pi = 3.14;

//         //create a variable that stores whether or not it is
//         boolean isVeteran = true;

//         int a = 10;
        
//          a = 19;

//         if(a < 20)
//         {
//             System.out.println("a is less than 20");
//             System.out.println("surprise!!!");
//         }
Scanner input = new Scanner(System.in);

//ask the user for a name
System.out.print("Enter your name: ");
String name = input.nextLine();

//ask the user for a location
System.out.print("Location: ");
String location = input.nextLine();

//ask the user for a salary
System.out.print("Enter your salary: $");
double salary = input.nextDouble();

//display those values
System.out.println("Name: " + name);
System.out.println("Location: " + location);
System.out.println("Salary: " + salary);

input.close();

    }
}

