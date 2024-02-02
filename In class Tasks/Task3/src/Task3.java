/**
 * 
 * Author: Samantha Wilson
 * Date: Feb2,24
 * 
 */

/**
 * 
 */
import javax.swing.JOptionPane;
public class Task3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String principle = JOptionPane.showInputDialog("Enter principle orginaly depositted.");
		double principle1= Double.parseDouble(principle);
		
		String interest = JOptionPane.showInputDialog("Enter interst rate.");
		double interest1 = Double.parseDouble(interest);
		
		String number = JOptionPane.showInputDialog("Enter times compounded.");
		double number1 = Double.parseDouble(number);
		
		String year = JOptionPane.showInputDialog("Enter number of years.");
		double year1 = Double.parseDouble(year);
		
		double money = principle1 * 1 + (Math.pow((interest1), number1 * year1) / number1);
		
		System.out.println("A = " + money);
		
	
	}

}
