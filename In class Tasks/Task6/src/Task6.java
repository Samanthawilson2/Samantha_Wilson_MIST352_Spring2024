/**
 * 
 */

/**
 * 
 */


import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;
public class Task6 {

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scnUserInput = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = scnUserInput.nextLine();
		
		
		System.out.println("Describe yourself:");
		String description = scnUserInput.nextLine();
		
		try (FileWriter fileWriter = new FileWriter("personal_page.html")) {
            fileWriter.write("<html>\n<head>\n</head>\n<body>\n<center>\n<h1>" + name + "</h1>\n</center>\n<hr />\n");
            fileWriter.write(description + "\n");
            fileWriter.write("<hr />\n</body>\n</html>");
            System.out.println("Personal web page has been created as 'personal_page.html'");
        } catch (IOException e) {
            System.err.println("An error occurred while creating the HTML file.");
            e.printStackTrace();
        }
		
		
	}

}
