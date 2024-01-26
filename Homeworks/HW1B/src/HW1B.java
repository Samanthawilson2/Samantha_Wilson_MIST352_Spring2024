import java.util.Scanner;

public class HW1B {
	public static void main(String[] args) {
		// Added scanner
		Scanner scnUserInput =  new Scanner (System.in);
		
		// Declaring a string variable not integer
		System.out.println("Enter string variable");
		String numberAsString = scnUserInput.nextLine();
		
		// Declaring an integer variable not string
		System.out.println("Enter Int");
		int number = scnUserInput.nextInt();
		
		// Declaring a boolean variable and it should not have quotation marks
		boolean flag = true; // This should be a boolean value
		
		// Declaring a float variable instead of double
		float decimalNumber = 3.14f;
		
		// Printing a greeting message with new line added quotation marks
		System.out.println("Hello World\n");
		
		// Printing tabbed text added quotation marks
		System.out.println("\tTabbed text");
		
		// Printing a variable I deleted because it was undeclared
		
		// Concatenating string with integer using escape sequences added right quotation marks and made it one line
		System.out.println("Value of number:\t" + number + "\nValue of numberAsString:\t" + numberAsString);

		// Declaring a constant changed PI to Pi
		double Pi = 3.14159;
		
		// Printing a complex message made it all one line
		System.out.println("The value of flag is " + flag + ", and the decimal number is " + decimalNumber);
		
		// Printing a test message capitalized the s but it is not needed
	}
}
