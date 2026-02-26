// Program: Create a class and object

class Student {

    String name;   // Instance variable
    int age;

    void display() {
        // Method inside class
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ClassObject{

    public static void main(String[] args) {

        Student s1 = new Student();  
        // Creating object of Student class

        s1.name = "John";  // Assigning values
        s1.age = 20;

        s1.display();  // Calling method
    }
}