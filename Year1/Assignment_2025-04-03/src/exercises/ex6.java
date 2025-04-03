// Assignment: 1
// Author: ori asher, ID: 01234567

package exercises;

import java.util.Scanner;


public class ex6
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the first number: ");
		int num1 = scanner.nextInt();
		System.out.print("enter the second number: ");
		int num2 = scanner.nextInt();
	
		while(num1 == num2)
		{
			System.out.println("Error: The numbers must be different.");
			System.out.println("Please enter two different numbers");
			System.out.print("enter the first number: ");
			num1 = scanner.nextInt();
			System.out.print("enter the second number: ");
			num2 = scanner.nextInt();
		}
		
		boolean samedigits = true;
		int temp1, temp2;
		int digit1, digit2;
		boolean found;
		
		temp1 = num1;
		while(temp1 != 0 && samedigits)
		{
			digit1 = temp1 % 10;
			temp2 = num2;
			found = false;
			
			while(temp2 != 0)
			{
				digit2 = temp2 % 10;
				//System.out.printf("digit1: %d  |  digit2: %d  (%s | %s)\n", digit1, digit2, (digit1==digit2)?"True":"False" , (-digit1==digit2)?"True":"False");
				if(digit1 == digit2 || -digit1 == digit2)
				{
					found = true;
					break;
				}	
		
		System.out.println(""); 
		temp2 = num2;
		while(temp2 != 0 && samedigits)
		{
			digit2 = temp2 % 10; 
			temp1 = num1;		
			found = false;       
			
			while (temp1 != 0)    			{
				digit1 = temp1 % 10; 
				//System.out.printf("digit1: %d  |  digit2: %d  (%s | %s)\n", digit1, digit2, (digit1==digit2)?"True":"False" , (-digit1==digit2)?"True":"False");
				if (digit1 == digit2 || -digit1 == digit2) 
				{
					found = true;
					break;
				}
				temp1 = temp1 / 10; 
			}
			
			if (!found)
				samedigits = false;
			
			temp2 = temp2 / 10;
		}

		if(samedigits)
		{
			System.out.println("Both numbers are composed of identical digits.");
		}
		else
		{
			System.out.println("Both numbers are NOT composed of identical digits.");
		}
		
		scanner.close();
	}
}}}