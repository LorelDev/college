// Assignment: 1
// Author: ori asher, ID: 01234567

package exercises;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Hello and welcome to the Currency Converter!");
	System.out.println("please anter the exchane rate (USD  to NIS)");
	float rate = scanner.nextFloat();
	
	System.out.println("great! now anter the amount in USD: ");
	float USD = scanner.nextFloat();
	
	System.out.print("The equivalent amount in NIS is: " + USD*rate);
		
	scanner.close();

	}


}
