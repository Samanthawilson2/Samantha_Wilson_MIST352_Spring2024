/**
 * 
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 
 */
public class Csv2Arff {

	/**
	 * 
	 */
	public static void main(String[] args) {}
		private String csvFileLocation;
		
		/**
		 * Keep as is. 
		 * Constructor.
		 * @param Location: The name 
		 */
		public Csv2Arff(String strFileLocation)
		{
			csvFileLocation=strFileLocation;
		}
		
		/**
		 * You need to code this
		 * This method accepts a name of a csv file and it writes an arff file from the csv file
		 * Writing arff file is similar to writing any .txt file. Just make sure the arff file name ends with .arff
		 * @param theLocation: The name and location of any csv file
		 */
		public void Convert2Arff(String theLocation)
		{
			String arffFileName = theLocation.replace(".csv", ".arff"); // Change file extension to .arff
	        try (BufferedReader br = new BufferedReader(new FileReader(theLocation));
	                FileWriter writer = new FileWriter(arffFileName)) {
	        	// Read CSV data and write to ARFF file
	            String line;
	            while ((line = br.readLine()) != null) {
	                writer.write(line + "\n");
	                writer.close();
	                System.out.println("Done =)" + arffFileName);

	            }} catch (IOException e) {
	                e.printStackTrace();
	            }
	        
	            
		}
		
		/**
		 * You need to code this
		 * This method should read the text file given in theFile, and store it into a two dimensional array of Strings.
		 * This method should return the data given in a specific row and column in the two dimensional array
		 * @param theFile: name of the csv file to open 
		 * @param row: row number in the two dimensional array
		 * @param column: column number in the two dimensional array
		 * @return strData2Return: the data in the [row][column]
		 */
		public static String RetrieveCell(String theFile, int row, int column)
		{
			String strData2Return="";
			try (BufferedReader br = new BufferedReader(new FileReader(theFile))) {
	            String line;
	            int currentRow = 0;
	            while ((line = br.readLine()) != null) {
	                if (currentRow == row) {
	                    String[] cells = line.split(",");
	                    if (column >= 0 && column < cells.length) {
	                        strData2Return = cells[column];
	                        break;
	                    }
	                }
	                currentRow++;
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
			return strData2Return;
		

	

	}

}
