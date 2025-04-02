// Assignment: 1
// Author: ori asher, ID: 01234567

package exercises;

import java.util.Scanner;

public class ex8
{

	public static void main(String[] args) 
	{
	Scanner scanner = new Scanner(System.in);
	
	int lowerBound = 0;
	int upperBound = 0;
	int  tries = 0;

	while(tries<3) 
	{
		System.out.println("Enter the lower and upper bound for numbers: ");
		lowerBound = scanner.nextInt();
		upperBound = scanner.nextInt();
		
		if (lowerBound<0 || upperBound<0||upperBound <= lowerBound) {
			tries++;
			System.out.println("Error, please try again");
		}else {
			break;
		}
	}
	
	if (tries==3) {
		System.out.println("Error, tried 3 times, exiting...");
	}
	
	else
	{
		boolean found = false;
		
		for(int number = lowerBound; number <= upperBound; number++)
		{
			int temp = number;
			int digitcount = 0;
			
			while(temp>0){
				digitcount++;
				temp = temp / 10;
			}
			
			temp = number;
			int sum =0;
			
			while(temp>0) {
				int digit =temp%10;
				int power =1;
				
				for(int i = 0; i < digitcount; i++) {
					power = power * digit;
				}
				
				sum = sum + power;
				temp = temp / 10;
			}
			
			if (sum == number) {
				System.out.println(sum +" ");
				found = true;
			}
		}
		
		if (!found) {
			System.out.println("No Armstrong numbers in this range");
		}else {
			System.out.println("");
		}
		
	}
	scanner.close();

	}

}
