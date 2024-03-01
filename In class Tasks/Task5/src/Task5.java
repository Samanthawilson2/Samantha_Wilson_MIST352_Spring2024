/**
 * 
 */

/**
 * 
 */

import java.util.Scanner;
public class Task5 {

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		Scanner scnUserInput = new Scanner(System.in);
		System.out.println("How many floors does the hotel have?");
		int intFloor = scnUserInput.nextInt();
		while (intFloor<=0)
		{
			System.out.println("Invalid. Enter 1 or more:");
			
			intFloor = scnUserInput.nextInt();
		}
	
		int floor = 1;
		int occupiedRooms = 0;
		int totalRooms = 0;
		while (floor<=intFloor) {
	
		System.out.println("How many rooms does floor " + floor + " have?");
		int rooms = scnUserInput.nextInt();
		while (rooms<=9)
			
		{System.out.println("Invalid. Enter 10 or more:");
		
		rooms = scnUserInput.nextInt();
		
		}
		
		totalRooms += rooms;
		
		System.out.println("How many rooms are occupied on floor " + floor +"?");
		int occupied = scnUserInput.nextInt();
		occupiedRooms += occupied;
		
		floor++;
	}
		scnUserInput.close();
		int vacantRooms = totalRooms - occupiedRooms;
		double occupancyRate = (double) occupiedRooms / totalRooms;
		System.out.println("Number of rooms: " + totalRooms);
		System.out.println("Number of occupied rooms: " + occupiedRooms);
		System.out.println("Number of vacant rooms: " + vacantRooms);
		System.out.println("Occupancy rate: " + occupancyRate);
		
	}
	

	
}
