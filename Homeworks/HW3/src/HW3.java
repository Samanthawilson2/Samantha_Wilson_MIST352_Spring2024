/**Author: Samantha Wilson
 * MIST 352-001 2:30pm
 * HW3
 * 
 */

/**
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

public class HW3 {

	private static final String SummerizeEmployee = null;

	/**
	 * 
	 */
	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub

		String strDataLocation ="src/EmployeeData.txt";
		String strOutputLocation ="src/EmployeeSummary.txt";
		File myFile = new File(strDataLocation);
		Scanner inputFile = new Scanner (myFile);
		PrintWriter writer =new PrintWriter(strOutputLocation);
		int intChoice  = Integer.parseInt( JOptionPane.showInputDialog(null,  ViewOptions()));
		DataSummary myData = new DataSummary(strDataLocation);
		
		
		while(intChoice !=0)
		{
			switch(intChoice)
			{
			case 1:
				myData.ViewEmployeeAndIDs();
				break;
			case 2:
				 String searchKeyword = JOptionPane.showInputDialog(null, "Enter employee name to search:");
                 myData.SearchEmployee(searchKeyword);
                 break;
			case 3:
				myData.ViewRoles();
				break;
			case 4:
				String roleToView = JOptionPane.showInputDialog(null, "Enter role to view employees:");
                myData.ViewEmployeeForRole(roleToView);
                break;
			case 5:
				double avgSalary = myData.getAverage();
                JOptionPane.showMessageDialog(null, "Average Salary: " + avgSalary);
                break;
			case 6:
				Employee summaryData = new Employee(SummerizeEmployee);
				String summary = summaryData.SummerizeEmployee();
                  break;
              default:
                  JOptionPane.showMessageDialog(null, "Invalid choice");
                  break;
				
			}
			intChoice  = Integer.parseInt( JOptionPane.showInputDialog(null,  ViewOptions()));	
		}


		writer.close();
		inputFile.close();	
		
	
		
	}

	private static Object ViewOptions() {
		String strMessageToDisplay="Choose an option:"
				+ "\n0.\tExit"
				+ "\n1.\tView Employees and IDs"
				+ "\n2.\tSearch for Employee"
				+ "\n3.\tView current roles"
				+ "\n4.\tView employees for a certain role"
				+ "\n5.\tView Average Salary"
				+ "\n6.\tSummerize and Write data";
		return strMessageToDisplay;
	
	}

}
