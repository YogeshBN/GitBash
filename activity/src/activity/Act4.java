package activity;

import java.util.Scanner;

public class Act4 {
	public static void main(String[] args) {
		Scanner obj4 = new Scanner(System.in);
		System.out.print("Enter your name, roll number and field of interest :");
		String na = obj4.next();
		int n = obj4.nextInt(); 
		String in =obj4.next();
		
	System.out.print("Hey, my name is "+ na+" " +"and my roll number is "+ n +". My field of interest are "+ in +".");

	}

}

