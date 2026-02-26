// Program: Check day of week using switch

import java.util.Scanner;

public class SwitchCase{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number (1-3): ");
        int day = input.nextInt();

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;  // break prevents fall-through

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                // Runs if no case matches
                System.out.println("Invalid number");
        }

        input.close();
    }
}