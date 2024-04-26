/**
 * 
 */

/**
 * 
 */
public class LandTract {

	/**
	 * @param args
	 */
	public static void main(String[] args) {}
	    private double length;
	    private double width;

	    // Constructor
	    public LandTract(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }

	    // Accessor method for length
	    public double getLength() {
	        return length;
	    }

	    // Accessor method for width
	    public double getWidth() {
	        return width;
	    }

	    // Method to calculate area
	    public double calculateArea() {
	        return length * width;
	    }

	    // Override toString() method to display LandTract data
	    public String toString() {
	        return String.format("Length: %.2f\nWidth: %.2f\nArea: %.2f", length, width, calculateArea());
	    }

	    // Method to check equality of two LandTract objects
	    public boolean equals(LandTract tract) {
	        return this.calculateArea() == tract.calculateArea();
	    }
	}