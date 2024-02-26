/*
 * Samantha Wilson
 * HW2-[2/19/24]
 */
import javax.swing.JOptionPane;

public class HW2 {

	public static void main(String[] args) {
		// Welcome with dialog box
		JOptionPane.showMessageDialog(null, "Welcome to Java Juice Bar!");
		// Display and ask user
		String juice = JOptionPane.showInputDialog(null, "Select your base juice:\n 1. Apple - $5.00\n"
				+ "2. Orange - $4.50\n 3. Mango $6.00\n 4. Carrot - $5.50");
		// Initialize
		double Discount = 0;
		double JuicePrice = 0;
		double Ginger = 0;
		int SelectedCase = 0;
		String SelectedJuice = "";
		int base = 1;
		// Switch for juice prices
		
		switch (base) {
			case 1:
				JuicePrice = 5.00;
				SelectedJuice = "Apple";
				break;
			case 2:
				JuicePrice = 4.50;
				SelectedJuice = "Orange";
				break;
			case 3:
				JuicePrice = 6.00;
				SelectedJuice = "Mango";
				break;
			case 4:
				JuicePrice = 5.50;
				SelectedJuice = "Carrot";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid selection. Please restart the program.");
				break; 
		}
		
		// Ask for Add on
		int addOn = JOptionPane.showConfirmDialog(null, "Woukd you like to add ginger for an extra $1.00?", "Ginger", JOptionPane.YES_NO_OPTION);
		
		if (addOn == JOptionPane.YES_OPTION) {
			Ginger = 1.00;
			Discount = 0.50;
			}
		String GingerAdd ="";
		if (Ginger > 0) {
				GingerAdd = "\nAdd-On: Ginger - $" + String.format("%.2f", Ginger) + "\n-------------------";
				
		} 
		
			
		// Calculate ginger and juice cost
		double JuiceGinger = Ginger + JuicePrice;
		
		if (addOn == JOptionPane.YES_OPTION & SelectedCase == 3)
		{
					JuiceGinger = JuiceGinger - Discount;
		}
		// Make Bill
		String billSummary = "|| Final Bill ||\n-------------------\nBase Juice: " + SelectedJuice + " - $" 
				+ String.format("%.2f", JuicePrice) + GingerAdd + "\n-------------------" + "\nFull Price: $" + String.format("%.2f", JuiceGinger)
				+ "\nDiscount: $" + String.format("%.2f", Discount) + "\n-------------------" + "\nTotal Before Tax: $"
				+ String.format("%.2f", JuiceGinger) + "\nTax: $" + String.format("%.2f", JuiceGinger * 0.16) + "\n-------------------"
				+ "\nTotal After Tax: $" + String.format("%.2f", JuiceGinger * 1.16) + "\n-------------------";
		//Show Bill
		JOptionPane.showMessageDialog(null,billSummary);
		
		}
	}

	
	


