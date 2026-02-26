// Program: Using constructor

class Car {

    String brand;

    // Constructor → same name as class
    Car(String b) {
        brand = b;  // initialize variable
    }

    void show() {
        System.out.println("Car brand: " + brand);
    }
}

public class Constructor{

    public static void main(String[] args) {

        Car c1 = new Car("Toyota");  // Constructor runs automatically
        c1.show();
    }
}