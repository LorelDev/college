// Assignment: 1
// Author: ori asher, ID: 01234567

package exercises;

import java.util.Scanner;

public class ex7
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int n = scanner.nextInt();
	
		while( n<1 || n>9)
		{
			System.out.println("Error: Please enter a positive integer greater than 0.");
			n = scanner.nextInt();
		}
		int start = 1;
		for(int i = 1; i <=n; i++)
			start = start*10;
		
		int end = 1;
		for(int i = 1; i <=n+1; i++) 
			end = end*10;
	
		System.out.printf("Palindrome numbers between %d and %d\n",start,end);
		
		int c = 0;
		for (int i = start; i <= end-1; i++)
		{
			int original = i;   
			int reversed = 0;
			int temp = i;
			
			while (temp>0) 
			{
				int digit = temp%10;
				reversed = reversed*10 + digit;
				temp = temp/10;
				
				
				if (original == reversed)
				{
					System.out.print(i + ", ");
					c++;
					if(c==20) 
					{
						System.out.println("");
						c =0;
					}
				}
			}
		}
		
		scanner.close();
	}
		
}
