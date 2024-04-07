/**Author Samantha Wilson
 * 4-5-24
 * 
 */

import java.util.ArrayList;

/**
 * 
 */

public class Task8 {
	private ArrayList<Integer> employeeId = null;

	private ArrayList<Integer> hours = null;

	private ArrayList<Double> wages = null;{
	employeeId = new ArrayList<Integer>();

	employeeId.add(5658845);

	employeeId.add(4520125);

	employeeId.add(7895122);

	employeeId.add(8777541);

	employeeId.add(8451277);

	employeeId.add(1302850);

	employeeId.add(7580489);

	hours=new ArrayList<Integer>();

	wages=new ArrayList<Double>();

}
public ArrayList<Integer> getEmployeeId() {

return employeeId;

}

public void setEmployeeId(ArrayList<Integer> employeeId) {

this.employeeId = employeeId;

}

public ArrayList<Integer> getHours() {

return hours;

}

public void setHours(ArrayList<Integer> hours) {

this.hours = hours;

}

public ArrayList<Double> getWages() {

return wages;

}

public void setWages(ArrayList<Double> wages) {

this.wages = wages;

}

/* This method will calculate the gross pay of particular employee

* based on index value which is received as parameter

*/

public double getGrossPay(int id)

{

return hours.get(id)*wages.get(id);

}

}
