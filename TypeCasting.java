// Program: Type Casting

public class TypeCasting{

    public static void main(String[] args) {

        // Implicit Casting (Widening)
        int num = 10;
        double value = num;  
        // int automatically converted to double

        System.out.println(value);

        // Explicit Casting (Narrowing)
        double price = 9.99;
        int newPrice = (int) price;  
        // decimal part removed

        System.out.println(newPrice);
    }
}