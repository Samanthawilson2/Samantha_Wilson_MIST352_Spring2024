/**Samantha Wilson
 * MIST 352-001 2:30pm
 * HW3
 * 
 */

/**
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;

public class DataSummary {
	
	
		private String fileLocation;
		private double averageSalary;

    public static void main(String[] args) {
        // Create the employee data file
        try {
            EmployeeData("EmployeeData.txt");
        } catch (IOException e) {
            System.err.println("Error creating employee data file: " + e.getMessage());
            return;
        }
        
    }
    
private static void EmployeeData(String fileName) throws IOException {
	String data = "Pamela Walker,1992-12-04,Project Manager,6792,pamelawalker@service.com,136325\r\n"
			+ "Oliver Martin,1976-06-23,Human Resources Specialist,2529,olivermartin@service.com,184313\r\n"
			+ "Xavier Walker,1981-05-22,Sales Associate,8417,xavierwalker@service.com,199646\r\n"
			+ "Oliver Thomas,1966-03-11,Project Manager,1395,oliverthomas@service.com,212947\r\n"
			+ "Hannah Garcia,1965-02-25,Sales Associate,2185,hannahgarcia@service.com,122094\r\n"
			+ "Ian Hernandez,1983-05-08,Sales Associate,1729,ianhernandez@service.com,179356\r\n"
			+ "Violet Taylor,1980-03-23,Human Resources Specialist,6073,violettaylor@service.com,187785\r\n"
			+ "David Johnson,1970-02-12,Marketing Coordinator,8491,davidjohnson@service.com,229788\r\n"
			+ "Eva Rodriguez,1985-06-02,Product Manager,8543,evarodriguez@service.com,160392\r\n"
			+ "Kevin Johnson,1983-09-03,Product Manager,4232,kevinjohnson@service.com,137736\r\n"
			+ "Quincy Garcia,1999-01-25,Marketing Coordinator,5993,quincygarcia@service.com,141598\r\n"
			+ "Bob Hernandez,1989-11-07,Data Analyst,2806,bobhernandez@service.com,232088\r\n"
			+ "Hannah Thomas,1980-09-06,Software Developer,4368,hannahthomas@service.com,115846\r\n"
			+ "Rachel Miller,1988-05-25,Graphic Designer,3791,rachelmiller@service.com,157117\r\n"
			+ "Nora Gonzalez,1979-04-10,Project Manager,8604,noragonzalez@service.com,53550\r\n"
			+ "Xavier Thomas,1980-04-03,Graphic Designer,9407,xavierthomas@service.com,248993\r\n"
			+ "Pamela Garcia,1972-12-28,Software Developer,3249,pamelagarcia@service.com,135214\r\n"
			+ "Xavier Garcia,1970-04-17,Product Manager,6162,xaviergarcia@service.com,101809\r\n"
			+ "Alice Jackson,1984-07-27,Software Developer,9818,alicejackson@service.com,160328\r\n"
			+ "Xavier Walker,1963-08-06,Product Manager,8543,xavierwalker@service.com,197087\r\n"
			+ "Steve Jackson,1969-04-14,Graphic Designer,3796,stevejackson@service.com,77836\r\n"
			+ "Yvonne Martin,1975-12-26,Graphic Designer,1683,yvonnemartin@service.com,179256\r\n"
			+ "Rachel Martin,1996-06-03,Software Developer,2700,rachelmartin@service.com,91511\r\n"
			+ "Rachel Wilson,1987-06-08,Software Developer,7306,rachelwilson@service.com,212362\r\n"
			+ "Frank Johnson,1974-11-19,Marketing Coordinator,7016,frankjohnson@service.com,248147\r\n"
			+ "Eva Rodriguez,1961-08-10,Human Resources Specialist,3414,evarodriguez@service.com,64730\r\n"
			+ "Zack Martinez,1980-11-01,Software Developer,7025,zackmartinez@service.com,118747\r\n"
			+ "Quincy Martin,1988-01-13,Sales Associate,3515,quincymartin@service.com,148556\r\n"
			+ "Violet Taylor,1994-02-03,Data Analyst,3140,violettaylor@service.com,165852\r\n"
			+ "Nora Robinson,1996-10-07,Marketing Coordinator,4160,norarobinson@service.com,152083\r\n"
			+ "David Johnson,1970-03-27,Product Manager,8119,davidjohnson@service.com,167473\r\n"
			+ "Oliver Thomas,1987-10-25,Marketing Coordinator,2970,oliverthomas@service.com,139442\r\n"
			+ "Nora Anderson,1967-10-02,Project Manager,7668,noraanderson@service.com,183651\r\n"
			+ "Mike Robinson,1968-05-24,Graphic Designer,9078,mikerobinson@service.com,46472\r\n"
			+ "Kevin Johnson,1971-04-13,Project Manager,2848,kevinjohnson@service.com,209620\r\n"
			+ "Grace Jackson,1986-03-04,Human Resources Specialist,8694,gracejackson@service.com,183784\r\n"
			+ "Xavier Garcia,1987-05-19,Marketing Coordinator,4120,xaviergarcia@service.com,52293\r\n"
			+ "Steve Johnson,1998-05-08,Product Manager,2368,stevejohnson@service.com,88488\r\n"
			+ "William White,1971-11-18,Project Manager,3018,williamwhite@service.com,155121\r\n"
			+ "Alice Johnson,1961-01-22,Software Developer,5678,alicejohnson@service.com,238786\r\n"
			+ "Julia Johnson,1980-03-04,Project Manager,4356,juliajohnson@service.com,71311\r\n"
			+ "Ian Rodriguez,1982-11-10,Human Resources Specialist,8079,ianrodriguez@service.com,71390\r\n"
			+ "Violet Miller,1999-05-15,Human Resources Specialist,2434,violetmiller@service.com,248448\r\n"
			+ "Charlie Brown,1984-11-17,Marketing Coordinator,3473,charliebrown@service.com,115632\r\n"
			+ "Ian Hernandez,1977-11-09,Project Manager,1316,ianhernandez@service.com,47618\r\n"
			+ "Eva Hernandez,1988-10-25,Marketing Coordinator,4192,evahernandez@service.com,162463\r\n"
			+ "Xavier Taylor,1960-03-16,Software Developer,3517,xaviertaylor@service.com,205828\r\n"
			+ "Ian Rodriguez,1966-07-23,Human Resources Specialist,8400,ianrodriguez@service.com,137917\r\n"
			+ "Yvonne Thomas,1998-11-20,Sales Associate,9393,yvonnethomas@service.com,231575\r\n"
			+ "Zack Williams,1995-07-25,Human Resources Specialist,5209,zackwilliams@service.com,235646\r\n"
			+ "William Smith,1978-08-03,Project Manager,2418,williamsmith@service.com,238457\r\n"
			+ "David Johnson,1995-06-22,Human Resources Specialist,1914,davidjohnson@service.com,86594\r\n"
			+ "David Johnson,1976-04-15,Software Developer,1123,davidjohnson@service.com,230876\r\n"
			+ "Bob Hernandez,1992-11-04,Project Manager,1227,bobhernandez@service.com,63871\r\n"
			+ "Umar Williams,2000-11-12,Data Analyst,9903,umarwilliams@service.com,73901\r\n"
			+ "Alice Jackson,1961-06-21,Marketing Coordinator,8782,alicejackson@service.com,249420\r\n"
			+ "Eva Rodriguez,1966-09-02,Human Resources Specialist,3169,evarodriguez@service.com,161599\r\n"
			+ "Mike Gonzalez,1998-02-22,Software Developer,5330,mikegonzalez@service.com,117251\r\n"
			+ "Quincy Harris,1991-04-18,Sales Associate,4394,quincyharris@service.com,203097\r\n"
			+ "Mike Williams,1993-08-12,Software Developer,8651,mikewilliams@service.com,221233\r\n"
			+ "Bob Rodriguez,1974-10-22,Project Manager,9419,bobrodriguez@service.com,125478\r\n"
			+ "Charlie Lopez,1987-07-04,Data Analyst,3573,charlielopez@service.com,57449\r\n"
			+ "Bob Rodriguez,1967-03-27,Human Resources Specialist,5886,bobrodriguez@service.com,112609\r\n"
			+ "Umar Thompson,1996-10-28,Graphic Designer,1379,umarthompson@service.com,171688\r\n"
			+ "Quincy Garcia,1964-04-02,Product Manager,1673,quincygarcia@service.com,120495\r\n"
			+ "Frank Jackson,1983-03-19,Human Resources Specialist,5596,frankjackson@service.com,194034\r\n"
			+ "Xavier Walker,1989-01-15,Data Analyst,2532,xavierwalker@service.com,165459\r\n"
			+ "Bob Rodriguez,1970-09-15,Human Resources Specialist,5700,bobrodriguez@service.com,204541\r\n"
			+ "Frank Jackson,1967-07-18,Project Manager,3966,frankjackson@service.com,142256\r\n"
			+ "Eva Hernandez,1976-10-19,Sales Associate,4572,evahernandez@service.com,159865\r\n"
			+ "Ian Rodriguez,1977-11-13,Sales Associate,3074,ianrodriguez@service.com,102629\r\n"
			+ "Ian Rodriguez,1968-05-24,Data Analyst,7850,ianrodriguez@service.com,75349\r\n"
			+ "Tina Robinson,1983-04-22,Project Manager,3771,tinarobinson@service.com,53786\r\n"
			+ "Nora Williams,1970-04-08,Human Resources Specialist,2075,norawilliams@service.com,207043\r\n"
			+ "Luna Williams,1999-03-08,Product Manager,9694,lunawilliams@service.com,245559\r\n"
			+ "Julia Jackson,1989-12-10,Sales Associate,7477,juliajackson@service.com,62351\r\n"
			+ "Nora Williams,1963-06-26,Software Developer,2372,norawilliams@service.com,156503\r\n"
			+ "William Lopez,1966-03-24,Data Analyst,8543,williamlopez@service.com,217721\r\n"
			+ "Mike Thompson,1975-06-20,Human Resources Specialist,9050,mikethompson@service.com,57397\r\n"
			+ "Luna Gonzalez,1985-02-27,Sales Associate,6550,lunagonzalez@service.com,165315\r\n"
			+ "Pamela Garcia,1995-11-24,Human Resources Specialist,1257,pamelagarcia@service.com,234748\r\n"
			+ "Eva Hernandez,2000-02-20,Product Manager,7928,evahernandez@service.com,147859\r\n"
			+ "Violet Taylor,1963-03-09,Graphic Designer,5114,violettaylor@service.com,238682\r\n"
			+ "Xavier Garcia,1961-12-11,Sales Associate,1535,xaviergarcia@service.com,108820\r\n"
			+ "Charlie Smith,1980-03-12,Product Manager,9207,charliesmith@service.com,48537\r\n"
			+ "Yvonne Garcia,1995-12-08,Project Manager,5860,yvonnegarcia@service.com,193254\r\n"
			+ "Charlie Lewis,1991-05-18,Software Developer,7645,charlielewis@service.com,153567\r\n"
			+ "Luna Gonzalez,1986-08-16,Marketing Coordinator,4961,lunagonzalez@service.com,142103\r\n"
			+ "Bob Hernandez,1987-02-07,Data Analyst,3984,bobhernandez@service.com,234385\r\n"
			+ "Quincy Taylor,1993-10-14,Project Manager,6759,quincytaylor@service.com,130808\r\n"
			+ "Zack Robinson,1971-02-14,Software Developer,2115,zackrobinson@service.com,51490\r\n"
			+ "William Smith,1969-06-11,Software Developer,7629,williamsmith@service.com,152582\r\n"
			+ "William Lewis,1971-06-17,Product Manager,1055,williamlewis@service.com,153491\r\n"
			+ "Tina Robinson,1974-11-11,Sales Associate,2067,tinarobinson@service.com,249409\r\n"
			+ "Yvonne Wilson,1966-02-26,Data Analyst,6512,yvonnewilson@service.com,134477\r\n"
			+ "Xavier Walker,1961-11-06,Data Analyst,4963,xavierwalker@service.com,234045\r\n"
			+ "Ian Hernandez,1992-01-07,Data Analyst,3690,ianhernandez@service.com,218744\r\n"
			+ "Hannah Taylor,1981-05-20,Software Developer,5777,hannahtaylor@service.com,87140\r\n"
			+ "Oliver Wilson,1965-06-15,Software Developer,9988,oliverwilson@service.com,104374\r\n"
			+ "Hannah Miller,1998-11-17,Product Manager,2026,hannahmiller@service.com,114491\r\n"
			+ "Violet Walker,1986-07-05,Data Analyst,8060,violetwalker@service.com,92204\r\n"
			+ "Zack Martinez,1998-04-05,Software Developer,2937,zackmartinez@service.com,178187\r\n"
			+ "Julia Jackson,1998-02-06,Graphic Designer,8260,juliajackson@service.com,237157\r\n"
			+ "Pamela Martin,1988-01-12,Project Manager,3897,pamelamartin@service.com,187111\r\n"
			+ "Grace Jackson,1990-04-05,Graphic Designer,9935,gracejackson@service.com,240645\r\n"
			+ "Umar Williams,1964-11-11,Graphic Designer,3019,umarwilliams@service.com,136077\r\n"
			+ "William Moore,1984-05-15,Marketing Coordinator,5145,williammoore@service.com,242271\r\n"
			+ "Alice Jackson,1997-02-09,Sales Associate,4527,alicejackson@service.com,82470\r\n"
			+ "Rachel Thomas,1977-02-20,Human Resources Specialist,5516,rachelthomas@service.com,61670\r\n"
			+ "Rachel Taylor,1996-09-10,Product Manager,2216,racheltaylor@service.com,132480\r\n"
			+ "Pamela Taylor,1992-11-18,Product Manager,7004,pamelataylor@service.com,201183\r\n"
			+ "Hannah Garcia,1967-10-10,Project Manager,4953,hannahgarcia@service.com,49144\r\n"
			+ "Bob Hernandez,1997-03-14,Graphic Designer,4798,bobhernandez@service.com,101108\r\n"
			+ "Xavier Walker,1992-04-04,Software Developer,6545,xavierwalker@service.com,80427\r\n"
			+ "William Brown,1976-08-21,Software Developer,9320,williambrown@service.com,65648\r\n"
			+ "Nora Thompson,1997-09-12,Sales Associate,4734,norathompson@service.com,185081\r\n"
			+ "Yvonne Thomas,1987-10-20,Sales Associate,6225,yvonnethomas@service.com,220394\r\n"
			+ "Yvonne Thomas,1970-02-05,Marketing Coordinator,7521,yvonnethomas@service.com,130507\r\n"
			+ "Quincy Thomas,1994-05-09,Project Manager,9088,quincythomas@service.com,188734\r\n"
			+ "William Brown,1998-11-08,Graphic Designer,8798,williambrown@service.com,179513\r\n"
			+ "Umar Gonzalez,1964-02-02,Project Manager,6809,umargonzalez@service.com,201867\r\n"
			+ "Pamela Martin,1973-05-21,Sales Associate,5503,pamelamartin@service.com,159795\r\n"
			+ "Charlie Davis,1991-06-02,Data Analyst,9654,charliedavis@service.com,165571\r\n"
			+ "Quincy Taylor,1982-08-10,Data Analyst,2156,quincytaylor@service.com,185433\r\n"
			+ "Charlie Moore,1991-02-16,Project Manager,1564,charliemoore@service.com,83321\r\n"
			+ "Charlie Brown,1985-02-27,Sales Associate,7188,charliebrown@service.com,136628\r\n"
			+ "William Smith,1973-02-17,Software Developer,6586,williamsmith@service.com,208252\r\n"
			+ "Oliver Walker,1984-03-11,Data Analyst,3949,oliverwalker@service.com,113829\r\n"
			+ "Luna Thompson,1978-03-20,Sales Associate,8071,lunathompson@service.com,209863\r\n"
			+ "Tina Williams,1973-08-11,Graphic Designer,4524,tinawilliams@service.com,198031\r\n"
			+ "Hannah Wilson,1963-04-28,Human Resources Specialist,2931,hannahwilson@service.com,105033\r\n"
			+ "Oliver Walker,1994-11-08,Product Manager,3584,oliverwalker@service.com,197504\r\n"
			+ "Pamela Taylor,1985-04-21,Product Manager,8548,pamelataylor@service.com,217631\r\n"
			+ "Violet Harris,1966-03-09,Graphic Designer,5054,violetharris@service.com,240404\r\n"
			+ "Charlie Lewis,1973-01-23,Human Resources Specialist,8880,charlielewis@service.com,55440\r\n"
			+ "Tina Anderson,1998-08-25,Human Resources Specialist,7995,tinaanderson@service.com,214328\r\n"
			+ "Umar Martinez,1997-09-14,Graphic Designer,8465,umarmartinez@service.com,69043\r\n"
			+ "Yvonne Martin,1981-04-28,Software Developer,8847,yvonnemartin@service.com,233588\r\n"
			+ "Mike Gonzalez,1973-08-02,Data Analyst,7886,mikegonzalez@service.com,223919\r\n"
			+ "Quincy Wilson,1965-07-01,Sales Associate,3444,quincywilson@service.com,179774\r\n"
			+ "Mike Gonzalez,1989-12-10,Sales Associate,3082,mikegonzalez@service.com,160023\r\n"
			+ "Quincy Walker,1992-12-16,Project Manager,8025,quincywalker@service.com,243553\r\n"
			+ "Charlie Perez,1992-05-04,Product Manager,1032,charlieperez@service.com,198204\r\n"
			+ "Quincy Martin,1976-04-03,Product Manager,3076,quincymartin@service.com,132936\r\n"
			+ "Zack Williams,1999-11-03,Marketing Coordinator,2883,zackwilliams@service.com,61798\r\n"
			+ "Umar Williams,1976-07-06,Product Manager,7156,umarwilliams@service.com,127910\r\n"
			+ "Zack Martinez,1967-06-07,Marketing Coordinator,3833,zackmartinez@service.com,247399\r\n"
			+ "Mike Martinez,1986-11-15,Software Developer,1849,mikemartinez@service.com,106527\r\n"
			+ "Umar Martinez,1979-10-16,Data Analyst,8090,umarmartinez@service.com,178608\r\n"
			+ "Luna Robinson,1966-01-11,Human Resources Specialist,7128,lunarobinson@service.com,209020\r\n"
			+ "Violet Miller,1986-01-16,Human Resources Specialist,4995,violetmiller@service.com,205552\r\n"
			+ "Rachel Thomas,1992-07-18,Marketing Coordinator,2092,rachelthomas@service.com,174010\r\n"
			+ "Rachel Martin,1986-06-17,Sales Associate,2159,rachelmartin@service.com,62028\r\n"
			+ "Pamela Harris,1971-11-26,Software Developer,2608,pamelaharris@service.com,194745\r\n"
			+ "Nora Gonzalez,1999-09-25,Human Resources Specialist,1479,noragonzalez@service.com,99196\r\n"
			+ "Charlie Clark,1984-10-08,Graphic Designer,6429,charlieclark@service.com,123433\r\n"
			+ "Nora Gonzalez,2000-12-10,Software Developer,1237,noragonzalez@service.com,181849\r\n"
			+ "Nora Anderson,1997-09-02,Marketing Coordinator,7610,noraanderson@service.com,131052\r\n"
			+ "William Clark,1979-04-07,Product Manager,8891,williamclark@service.com,61802\r\n"
			+ "Luna Anderson,1988-08-08,Project Manager,7169,lunaanderson@service.com,160979\r\n"
			+ "Zack Anderson,1986-02-27,Data Analyst,3335,zackanderson@service.com,239845\r\n"
			+ "Mike Anderson,1995-10-18,Software Developer,9415,mikeanderson@service.com,221638\r\n"
			+ "Mike Martinez,1975-05-11,Project Manager,6821,mikemartinez@service.com,85860\r\n"
			+ "Umar Gonzalez,1999-02-13,Data Analyst,3534,umargonzalez@service.com,234231\r\n"
			+ "Zack Thompson,1961-08-16,Human Resources Specialist,5671,zackthompson@service.com,69111\r\n"
			+ "Tina Thompson,1985-03-14,Software Developer,2576,tinathompson@service.com,231613\r\n"
			+ "Rachel Martin,1990-12-12,Marketing Coordinator,6600,rachelmartin@service.com,155444\r\n"
			+ "Tina Thompson,1990-03-11,Project Manager,8636,tinathompson@service.com,191580\r\n"
			+ "Mike Martinez,1974-07-17,Sales Associate,6174,mikemartinez@service.com,198065\r\n"
			+ "Tina Anderson,1988-11-08,Product Manager,1193,tinaanderson@service.com,63636\r\n"
			+ "Pamela Miller,1981-07-01,Sales Associate,6745,pamelamiller@service.com,156816\r\n"
			+ "Rachel Wilson,1978-08-27,Marketing Coordinator,6545,rachelwilson@service.com,77948\r\n"
			+ "Rachel Harris,1965-06-16,Software Developer,5827,rachelharris@service.com,79960\r\n"
			+ "Violet Miller,1997-08-04,Data Analyst,9294,violetmiller@service.com,203082\r\n"
			+ "Hannah Wilson,1987-06-21,Software Developer,7811,hannahwilson@service.com,98247\r\n"
			+ "Luna Robinson,1998-11-04,Project Manager,5292,lunarobinson@service.com,155272\r\n"
			+ "Yvonne Wilson,1969-12-27,Data Analyst,4947,yvonnewilson@service.com,207257\r\n"
			+ "Nora Robinson,1981-06-07,Project Manager,3028,norarobinson@service.com,83462\r\n"
			+ "Tina Thompson,1984-03-15,Project Manager,4030,tinathompson@service.com,231913\r\n"
			+ "Hannah Wilson,1982-05-26,Product Manager,9445,hannahwilson@service.com,201623\r\n"
			+ "Umar Martinez,2000-10-13,Project Manager,6462,umarmartinez@service.com,240462\r\n"
			+ "Zack Thompson,1964-03-13,Data Analyst,7297,zackthompson@service.com,203000\r\n"
			+ "Umar Robinson,1978-07-04,Graphic Designer,7556,umarrobinson@service.com,199646\r\n"
			+ "Yvonne Harris,1977-11-12,Product Manager,6554,yvonneharris@service.com,236605\r\n"
			+ "Oliver Wilson,1985-11-01,Software Developer,6975,oliverwilson@service.com,88701\r\n"
			+ "Luna Robinson,1975-05-03,Human Resources Specialist,1694,lunarobinson@service.com,118045\r\n"
			+ "Luna Martinez,1960-07-23,Marketing Coordinator,4625,lunamartinez@service.com,169111\r\n"
			+ "Pamela Miller,1986-05-25,Graphic Designer,9746,pamelamiller@service.com,200038\r\n"
			+ "Violet Harris,1989-08-11,Product Manager,1515,violetharris@service.com,181330\r\n"
			+ "Zack Anderson,1982-06-05,Graphic Designer,9828,zackanderson@service.com,67241\r\n"
			+ "Hannah Miller,1985-10-11,Data Analyst,4708,hannahmiller@service.com,102690\r\n"
			+ "Oliver Harris,1964-12-21,Human Resources Specialist,4350,oliverharris@service.com,233374\r\n"
			+ "Oliver Harris,1987-10-21,Software Developer,5877,oliverharris@service.com,86801\r\n"
			+ "Violet Harris,1970-10-04,Sales Associate,7501,violetharris@service.com,179327\r\n"
			+ "Oliver Miller,1976-01-26,Graphic Designer,8633,olivermiller@service.com,75354\r\n"
			+ "Tina Thompson,1978-01-13,Product Manager,1261,tinathompson@service.com,125278\r\n"
			+ "Luna Anderson,1987-02-13,Software Developer,8184,lunaanderson@service.com,169639\r\n"
			+ "Tina Anderson,1977-01-26,Sales Associate,3966,tinaanderson@service.com,72278\r\n"
			+ "Hannah Harris,1981-10-12,Sales Associate,7511,hannahharris@service.com,177515\r\n"
			+ "Yvonne Miller,1983-09-10,Data Analyst,6327,yvonnemiller@service.com,180485\r\n"
			;
	File file = new File(fileName);
    try (FileWriter writer = new FileWriter(file)) {
        writer.write(data);
	}
}
	
	public DataSummary(String file) throws FileNotFoundException
	{
		this.fileLocation = file;
		this.averageSalary = getAverage();}
	
		
		public double getAverage() throws FileNotFoundException
		{
			double totalSalary = 0;
	        int empCount = 0;
	        
	        File file = new File(fileLocation);
	        Scanner scanner = new Scanner(file);
	        
	        while (scanner.hasNextLine()) {
	        	String line = scanner.nextLine();
	        	double salary = extractSalary(line);
	        	totalSalary += salary;
	        	empCount++;
	        }
	        scanner.close();
	        
	        if (empCount > 0) {
	        	return totalSalary / empCount;
	        } else {
			return 0;
		}
			
		}
		 
		
	
	private double extractSalary(String line) {
       
        String[] parts = line.split(",");
        
        
        String salaryStr = parts[parts.length - 1];
        
        
        return Double.parseDouble(salaryStr);

}
public void ViewEmployeeAndIDs() throws FileNotFoundException
{
	File data = new File(fileLocation);
	Scanner scnReader = new Scanner(data);
	while(scnReader.hasNext()) {
		String strline = scnReader.nextLine();
		
		String[] parts = strline.split(",");
		if (parts.length >= 2) {
            String name = parts[0].trim();
            String id = parts[4].trim(); 
            System.out.println(strline.split(",")[1]);
            
	}
	}
	scnReader.close();
	
}

public void SearchEmployee(String strEmployee) throws FileNotFoundException
{
	 File data = new File (fileLocation);
	 Scanner scnReader = new Scanner(data);
	 
	 boolean found = false;
	 
	 StringBuilder result = new StringBuilder();
	 
	 while (scnReader.hasNextLine()) {
		 String line = scnReader.nextLine();
		 
		 if (line.toLowerCase().contains(strEmployee.toLowerCase()))
		 { result.append(line).append("\n");
		 found = true;
		 }
	 }
scnReader.close();
	if (found) {
		JOptionPane.showMessageDialog(null, result.toString(),"Search Result", JOptionPane.INFORMATION_MESSAGE);
	} else {
		JOptionPane.showMessageDialog(null, "Employee Not Found.", "Search Result", JOptionPane.INFORMATION_MESSAGE);}
		
	}
	public void ViewEmployeeForRole(String strRole) throws FileNotFoundException{
	{
		File data = new File (fileLocation);
		Scanner scnReader = new Scanner(data);
		
		boolean found = false;
		
		StringBuilder result = new StringBuilder();
		
		while (scnReader.hasNextLine()) {
			String line = scnReader.nextLine();
			
			String[] parts = line.split(",");
			if (parts.length >= 4 && parts[3].trim().equalsIgnoreCase(strRole)) {
				result.append(line).append("\n");
				found = true;
			}
		}
scnReader.close();
		
		if (found) {
			JOptionPane.showMessageDialog(null, result.toString(), "Employees in Role:"+strRole, JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null,"No employees found for role: "+strRole, "Search Result",JOptionPane.INFORMATION_MESSAGE);}}
			
			
	}
	public void ViewRoles() throws FileNotFoundException
	{	
		       
		        File myFile = new File(fileLocation);
		        Scanner inputFile = new Scanner(myFile);
		        Set<String> distinctRoles = new HashSet<>();

		        while(inputFile.hasNextLine()) {
		            String strData2Show = inputFile.nextLine();
		            // Splitting the line by comma
		            String[] dataParts = strData2Show.split(",");
		            // The role is the third element in the array (index 2)
		            distinctRoles.add(dataParts[2]);
		        }
		        inputFile.close();
		        String strRole="";
		        // Displaying distinct roles
		        for (String role : distinctRoles) {
		        	strRole = strRole + role + "\n";
		            //System.out.println(role);
		        }
		        JOptionPane.showMessageDialog(null, strRole);
		    }
	

}




















