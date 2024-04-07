/**Author Samantha Wilson
 * 4-5-24
 * 
 */

/**
 * 
 */
import java.util.ArrayList;


import java.text.DecimalFormat;
import java.util.Scanner;
public class Demo {

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int empId, workedHours;

		double wage;

		ArrayList<Double> wages = new ArrayList<Double>();

		ArrayList<Integer> whs = new ArrayList<Integer>();

		Task8 pr = new Task8();

		/*

		* Creating an Scanner class object which is used to get the inputs

		* entered by the user

		*/

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < pr.getEmployeeId().size(); i++) {

		// Getting the input entered by the user

		System.out.println("Employee Id:" + pr.getEmployeeId().get(i));

		System.out.print("Enter No of Worked Hours:");

		workedHours = sc.nextInt();

		while (true) {

		if (workedHours < 0) {

		System.out.println("** Invalid.Must be Positive **");

		} else {

		whs.add(workedHours);

		break;

		}

		}

		while (true) {

		System.out.print("Enter Payrate:");

		wage = sc.nextDouble();

		if (wage < 6.0) {

		System.out.print("** Invalid.Must be Graeter than 6.0 **");

		} else

		{

		wages.add(wage);

		break;

		}

		}

		}

		pr.setHours(whs);

		pr.setWages(wages);

		System.out.println("\nEmployee Id\tGross Pay($)");

		System.out.println("----------\t----------");

		for(int i=0;i<pr.getEmployeeId().size();i++)

		{

		System.out.printf("%d\t%.2f\n",pr.getEmployeeId().get(i),pr.getGrossPay(i));

		}

		}

		}