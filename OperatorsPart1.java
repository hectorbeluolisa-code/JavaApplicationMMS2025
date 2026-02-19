public class Operators{
	public static void main(String[] args) {
		//assignment operator(=)
		int num = 50;
		System.out.printf("the value of num is %d%n",num);
		
		//Arithmetic Operators(+,-,*,/,%)
		int num1 = 100;
		int num2 = 500;
		
		int addition = num1 + num2;
		System.out.printf("the sum of %d and %d is %d%n",num1,num2,addition);
		
		int subtraction = num1 - num2;
		System.out.printf("The different between %d and %d is %d%n",num1,num2,subtraction);
		
		int multiplication = num1 * num2;
		System.out.printf("The product of %d and %d is %d%n",num1,num2,multiplication);
		
		double quotient = (double)num1/num2;
		System.out.printf("The quotient of %d / %d is %.9f%n",num1,num2,quotient);
		
		int remainder = num1%num2;
		System.out.printf("The remainder between %d and %d is %d%n",num1,num2,remainder);
		
		
		//compound assignment operators
		num1 += num2;
		System.out.printf("The value of num1 is now %d%n",num1);
		
		int num1 = 100;
		int num2 = 500;
		num1 *= num2;
		System.out.printf("The value of num1 is now %d%n",num1);
		
		int num1 = 100;
		int num2 = 500;
		num1 -= num2;
		System.out.printf("The value of num1 is now %d%n",num1);
		
		int num1 = 100;
		int num2 = 500;
		num1 /= num2;
		System.out.printf("The value of num1 is now %d%n",num1);
		
		int num1 = 100;
		int num2 = 500;
		num1 %= num2;
		System.out.printf("The value of num1 is now %d%n",num1);
		
		//Relational Operators(>,<,>=,<=,!=,==): they  compare variables or values
		int number1 = 20, number2 = 50, number3 = 200;
		
		boolean isGreater = number1 > number2;
		

		
		

	}
}	
