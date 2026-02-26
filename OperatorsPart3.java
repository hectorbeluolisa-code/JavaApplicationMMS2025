// Program: Logical Operators

public class OperatorsPart3{

    public static void main(String[] args) {

        int age = 20;

        // && → AND (both conditions must be true)
        System.out.println(age > 18 && age < 30);

        // || → OR (at least one condition must be true)
        System.out.println(age < 18 || age == 20);

        // ! → NOT (reverses true/false)
        System.out.println(!(age > 18));
    }
}