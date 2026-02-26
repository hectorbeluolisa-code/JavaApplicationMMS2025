// Program: Print numbers from 1 to 5 using a for loop

public class ForLoop{

    public static void main(String[] args) {

        // for loop structure:
        // for(initialization; condition; increment/decrement)

        for (int i = 1; i <= 5; i++) {
            // int i = 1  → starting value
            // i <= 5     → loop runs while condition is TRUE
            // i++        → increases i by 1 each time

            System.out.println(i);  // prints current value of i
        }

        // Loop stops when condition becomes FALSE
    }
}