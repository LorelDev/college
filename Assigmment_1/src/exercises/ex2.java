// Assignment: 1
// Author: ori asher, ID: 01234567

package exercises;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("please enter distance in kolimeters: ");
	float km = scanner.nextFloat();
	System.out.print("the disstance in miles is: " + (1.609)*km);
	
	scanner.close();

}

}
