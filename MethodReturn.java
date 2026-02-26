// Program: Add two numbers using method

public class MethodReturn{

    // Method with parameters and return type
    static int add(int a, int b) {
        return a + b;  // returns sum
    }

    public static void main(String[] args) {

        int result = add(5, 3);  // calling method
        System.out.println("Sum = " + result);
    }
}