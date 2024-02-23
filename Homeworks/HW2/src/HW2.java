/*
 * Samantha Wilson
 * HW2-[2/19/24]
 */
import javax.swing.JOptionPane;

public class HW2 {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Welcome to Java Juice Bar!");
		// Display and ask user
		String juice = JOptionPane.showInputDialog(null, "Select your base juice:\n 1. Apple - $5.00\n"
				+ "2. Orange - $4.50\n 3. Mango $6.00\n 4. Carrot - $5.50");
		// Conversion
		int selection = Integer.parseInt(juice);
		// Switch for juice prices
		double price = 0.0;
		switch (selection) {
			case 1:
				price = 5.00;
				break;
			case 2:
				price = 4.50;
				break;
			case 3:
				price = 6.00;
				break;
			case 4:
				price = 5.50;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid selection. Please restart the program.");
				break; 
		}
		
		// Ask for Add on
		int addOn = JOptionPane.showConfirmDialog(null, "Woukd you like to add ginger for an extra $1.00?", "Ginger", JOptionPane.YES_NO_OPTION);
		double totalPrice = price;
		double discount = 0.0;
		if (addOn == JOptionPane.YES_OPTION && selection == 3) {
			totalPrice += 1.00;
			discount = 0.50;
			
		}else if (addOn == JOptionPane.YES_OPTION) {
				totalPrice += 1.00;
				
		} else if (addOn == JOptionPane.NO_OPTION) {
			totalPrice = price;
			}
		// Calculate Full Price
		double fullPrice = totalPrice - discount;
		
		// Calculate tax amount 
		double taxRate = 0.16;
		double taxAmount = totalPrice * taxRate;
		
		//Calculate total before tax
		double discountPrice = fullPrice + discount;
		
		// Calculate total with tax
		double totalPriceWith = totalPrice + taxAmount; 
		
		// Bill summary
		String baseJuice = getBaseJuice(selection);
        String extras = addOn == JOptionPane.YES_OPTION ? "Ginger ($1.00)" : "None";
        String billSummary = String.format("|| Final Bill ||\n-------------------\nBase Juice: %s\n-------------------\n"
        		+ "Add-On: %s\n-------------------\nFull Price: $%0.2f\n-------------------\nDiscount: -$%0.2f\n-------------------\n"
        		+ "Total Before Tax: $%0.2f\n-------------------\nTax: $%0.2f\n-------------------\nTotal After Tax: $%0.2f", 
        		baseJuice, extras, fullPrice, discount, discountPrice, taxAmount, totalPriceWith);
       
        JOptionPane.showMessageDialog(null, billSummary, "Your Bill", JOptionPane.INFORMATION_MESSAGE);
    
		}
	//For final bill
	private static String getBaseJuice(int selection) {
		switch (selection) {
		case 1:
            return "Apple - $5.00";
        case 2:
            return "Orange - $4.50";
        case 3:
            return "Mango - $6.00";
        case 4:
            return "Carrot - $5.50";
        default:
            return "Invalid Selection. Plrease restart the program.";
		}
	}

	
	}


