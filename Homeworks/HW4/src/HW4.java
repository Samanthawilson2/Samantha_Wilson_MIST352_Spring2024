/** Author: Samantha Wilson
 * 
 */
import java.io.File;
import java.io.IOException;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class HW4 {

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//***********************************************************************************************
				// Keep lines 21 - 27 as is
		        //Location of the data folder which has all csv files
				String directoryPath = "src/Data"; 
				//String array that has the names of all csv files, without the directory.
		        String[] csvFileNames = findCSVFileNames(new File(directoryPath));
		    //***********************************************************************************************
		        //to do:
	        	// 1. print out the array of csv files by calling the PrintArray method below
	        	System.out.println("CSV Files:");
		        PrintArray(csvFileNames);
	        	
	        	// 2. access the array csvFileNames add the directory to each file name. So, the file Ant1.csv should become src/Data/Ant1.csv   
	        	for (int counter =0; counter < csvFileNames.length; counter++)
	    			csvFileNames[counter]= directoryPath+"/"+csvFileNames[counter];
	        	// 3. print out the array of csv files again after adding directory to each by calling the PrintArray method below
	        	System.out.println("\nCSV Files with Directory:");
	        	PrintArray(csvFileNames);
	        	// 4. Go through the array again (using while / for loop), every time you access a cell, create an object of type Csv2Arff.
	         	for (int counter =0; counter < csvFileNames.length; counter++)
	         	{
	         		for (String csvFileName : csvFileNames) {
	         		Csv2Arff theArffFile= new Csv2Arff(csvFileNames[counter]);
	            	// 5. Call the proper method to write the arff file for the current csv file in the loop.
	         		theArffFile.Convert2Arff(csvFileNames[counter]);
	         		
	         	}
	        	// 6. Ask the user for any name of a file to look in, and then column number and row number.
	         	String output ="";
	         	int row=10;
	         	int column=5;
	         	Csv2Arff arffOutPut =  new Csv2Arff(output);
	         	arffOutPut.RetrieveCell(output,row,column);
	        		// 6.1 Printout the value from that file.
	         	System.out.println("\nValue at Row " + row + ", Column " + column + " in " + output);
	            }
	    }
		/**
		 *  You need to code this
		 *  This method simply prints out the content of any given String array
		 * @param array: The array to print
		 */
		public static void PrintArray(String[] array)
		{
			for (int counter =0; counter < array.length; counter++)
				System.out.println(array[counter]);
		}

		/**
		 * Keep as is.
		 * This method finds all csv files in a given directory
		 * @param directory: location of all csv files. This is passed from the main
		 * @return: Array of strings, each strring represents the name the location of a csv file
		 */
	    private static String[] findCSVFileNames(File directory) {
	        List<String> csvFileNames = new ArrayList<>();
	        addCSVFileNames(directory, csvFileNames);
	        return csvFileNames.toArray((new String[0]));
	    }

	    /**
	     * Keep as is.
	     * This method is magical. We Do not care what it does.
	     * @param directory
	     * @param csvFileNames
	     */
	    private static void addCSVFileNames(File directory, List<String> csvFileNames) {
	        if (directory.isDirectory()) {
	            // Define a filter for CSV files
	            FilenameFilter csvFilter = (dir, name) -> name.toLowerCase().endsWith(".csv");
	            
	            // List all CSV files in the current directory
	            File[] files = directory.listFiles(csvFilter);
	            if (files != null) {
	                for (File file : files) {
	                    if (file.isFile()) {
	                        csvFileNames.add(file.getName());
	                    }
	                }
	            }

	            // List all directories in the current directory
	            File[] dirs = directory.listFiles(File::isDirectory);
	            if (dirs != null) {
	                for (File dir : dirs) {
	                    addCSVFileNames(dir, csvFileNames); // Recursive call
	                }
	            }
	        }
	    }}


		
