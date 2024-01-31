/**
 * 
 */

/**
 * 
 */
import javax.swing.JOptionPane;
public class Task2 {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		name = JOptionPane.showInputDialog("Enter your name.");
		
		String age = JOptionPane.showInputDialog("Enter your age");

		String city;
		city = JOptionPane.showInputDialog("Enter your city");
		
		String college;
		college = JOptionPane.showInputDialog("Enter your college");
		
		String profession;
		profession = JOptionPane.showInputDialog("Enter your profession.");
		
		String animal;
		animal = JOptionPane.showInputDialog("Enter your animal.");
		
		String petname;
		petname = JOptionPane.showInputDialog("Enter your pet's name.");
		
		System.out.printf("There once was a person named %s who lived in a %s. "
				+ "At the age of %s, %s went to college at %s. "
				+ "%s graduted and went to work as a %s. Then, %s adopted a(n) %s named %s. "
				+ "They both lived happily ever after!",name,city,age,name,college,name,profession,name,animal,petname);
		
	}

}
