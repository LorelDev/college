// Assignment: 1
// Author: ori asher, ID: 01234567

package exercises;

import java.util.Scanner;

public class ex4
{

	public static void main(String[] args)
	{
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a three digit number: ");
	int num = scanner.nextInt();
	
	if (num >= 100 && num <= 999) 
	{
		int note200 = num/200;
		num = num%200;
		System.out.println( note200 + " bill/s of 200");
		int note100 = num/100;
		num = num%100;
		System.out.println(note100 + " bill/s of 100");
		int note50 = num/50;
		num = num%50;
		System.out.println(note50 + " bill/s of 50");
		int note20 = num/20;
		num = num%20;
		System.out.println(note20 + " bill/s of 20");
		int note10 = num/10;
		num = num%10;
		System.out.println(note10 + " coin/s of 10");
		int note5 = num/5;
		num = num%5;
		System.out.println(note5 + " coin/s of 5");
		int note2 = num/2;
		num = num%2;
		System.out.println(note2 + " coin/s of 2");
		int note1 = num/1;
		num = num%1;
		System.out.println(note1 + " coin/s of 1");
	}
	else {
		System.out.println("ERROR");
	}
	scanner.close();
	}
	
	
}

