// Program: Taking different types of user input

import java.util.Scanner;  // Import Scanner class

public class UserInput{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Create Scanner object to read keyboard input

        System.out.print("Enter your name: ");
        String name = input.nextLine();  
        // nextLine() → reads full sentence

        System.out.print("Enter your age: ");
        int age = input.nextInt();  
        // nextInt() → reads integer

        System.out.print("Enter your height (cm): ");
        double height = input.nextDouble();  
        // nextDouble() → reads decimal number

        System.out.println("Hello " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "cm");

        input.close();  // Always close Scanner
    }
}