// Assignment: 1
// Author: ori asher, ID: 01234567

package exercises;

import java.util.Scanner;

public class ex5
{

	public static void main(String[] args)
	{
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a number representing the day of the week");
	int d = scanner.nextInt();
	
	if (d > 7 || d<1) {
		System.out.print("ERROR");
	}
	else 
	{
		switch(d)
		{
			case 1:
			case 3:
			case 5:
				System.out.println("The call center is open from 10:00 to 13:00.");
				break;
				
			case 2:
				System.out.println("The call center is open from 9:00 to 14:00.");
				break;
			
			case 4:
				System.out.println("The call center is open from 10:00 to 13:00.");
				System.out.println("Additionally, the call center is open from 16:00 to 19:00.");
				break;
				
			case 6:
				System.out.print("The call center is open from 10:00 to 12:00.");
				break;
				
			case 7:
				System.out.print("The call center is closed.");
		
			
	
	
		}
	}
	
	scanner.close();

	}
}