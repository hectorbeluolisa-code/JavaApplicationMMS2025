// Program: Print numbers from 1 to 5 using while loop

public class WhileLoop{

    public static void main(String[] args) {

        int i = 1;  // Initialization happens before loop

        while (i <= 5) {
            // Condition is checked first

            System.out.println(i);
            i++;  // Important: increment to avoid infinite loop
        }

        // If condition becomes false, loop stops
    }
}