/**
 * Date 1.29.24
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Practiceone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int intAge=40;
		intAge+=10;
		System.out.println(intAge);
		
		System.out.println(3%4);
		// %f for double, %d or s for string
		double number = 1278.92;

		System.out.printf("The number is %f\n", number);
		
		//Chapter 2
		System.out.println("Hello!\nHow are you?");
		
		// + can be use for add and concatenation
		System.out.println("Hello" + "World");
		System.out.println("5 + 7");
		
		// boolean is true or false
		System.out.println("1/2");
		
		double result = Math.pow(4.0, 2.0);
		System.out.println(result);
		
		String name = "Samantha";
		
		Scanner keyboard = new Scanner (System.in);
		System.out.println("What is your laptop");
		String laptop = keyboard.nextLine();
		System.out.println("Awesome!");
	
		

		
		
	}

}
