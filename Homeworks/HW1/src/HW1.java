// Author: [Samantha Wilson]
// Class: MIST352-Spring24
// HW #1
// This program declares string, integer, boolean, and flag variables. While using those variables to print a message.

public class HW1 {
	public static void main(String[] args) {
		// Declaring a string variable not integer
		String numberAsString = "1234";
		
		// Declaring an integer variable not string
		int number = 5678;
		
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