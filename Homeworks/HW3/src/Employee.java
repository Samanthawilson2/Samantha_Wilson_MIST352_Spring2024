/**
 * 
 */

/**
 * 
 */

import java.util.Date;

public class Employee {

	
	
		private String name;
	    private String dateOfBirth;
	    private String role;
	    private int employeeId;
	    private String email;
	    private double salary;
	    private boolean aboveAvg ;
	    private String bar;

	    public Employee(String line)   		
		 {
	    	String[] parts = line.split(",");
	        if (parts.length >= 7) {
	            this.name = parts[0].trim();
	            this.dateOfBirth = parts[1].trim();
	            this.role = parts[2].trim();
	            this.employeeId = Integer.parseInt(parts[3].trim());
	            this.email = parts[4].trim();
	            this.salary = Double.parseDouble(parts[5].trim());
	            this.aboveAvg = false;
	            this.bar = parts[6].trim(); 
	        } else {
	        	System.err.println("Error: Insufficient data in line.");
	        	
	        }
   setAboveAvg(salary);
		 }
	    
	    public void setAboveAvg(double dblAverage)
	    {
	    	 if (salary > dblAverage) {
	             aboveAvg = true;
	         } else {
	             aboveAvg = false;
	}}
	    
	    	 public String SalaryBarChart(double salary) {
	    		 
	    		 int numStars = (int) (salary / 10000);
	    		 
	    		 StringBuilder bar = new StringBuilder();
	    		 
	    		 for (int i = 0; i < numStars; i++) {
	    			 bar.append('*');
	    		 }
	    		   return bar.toString();
	      	
	    }
public String SummerizeEmployee()

{
	StringBuilder summary = new StringBuilder();
    summary.append("Name: ").append(name).append("\n");
    summary.append("Employee ID: ").append(employeeId).append("\n");
    summary.append("Salary Bar Chart: ").append(SalaryBarChart(salary)).append("\n");
    summary.append("Above Average: ").append(aboveAvg ? "Yes" : "No").append("\n");
    return summary.toString();
	
}

}
