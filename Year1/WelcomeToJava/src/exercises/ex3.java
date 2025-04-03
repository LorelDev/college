// Assignment: 1
// Author: ori asher, ID: 01234567

package exercises;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("please enter lengths of three edges:");
	double a = scanner.nextInt();
	double b = scanner.nextInt();
	double c = scanner.nextInt();
	
	if(a<=0 || b<=0 || c<=0){
	System.out.print("ERROR");
	}
	
	else if (a + b <= c || a + c <= b || b + c <= b){
	System.out.print("We cannot make a triangle from these edges");
	}
	
	else {
		if (a == b && b == c){
		System.out.print("Equilateral triangle");}
		else if(a==b || a==b || c==b ){
		System.out.print("Isosceles triangle");}
		else {
		System.out.print("Scalene triangle");
		}
		}
	scanner.close();

	}
	}
	


