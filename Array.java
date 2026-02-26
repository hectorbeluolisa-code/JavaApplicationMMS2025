// Program: Store and print array elements

public class Array{

    public static void main(String[] args) {

        // Array declaration and initialization
        int[] numbers = {10, 20, 30, 40, 50};

        // Array index starts from 0
        System.out.println(numbers[0]);  // prints 10

        // Loop through array
        for (int i = 0; i < numbers.length; i++) {
            // numbers.length gives total size
            System.out.println(numbers[i]);
        }
    }
}