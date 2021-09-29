package activity;

import java.util.Scanner;
public class Act7 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of classes held :");
		double na = sc.nextDouble();
		System.out.print("Enter Number of classes you attended :");
		double sa = sc.nextDouble();
		
		double pa = (sa/na)*100;
		System.out.println("Attendance percentage :"+pa +"%");
		
		if(pa>70)
			System.out.println("You are allowed to attend exam....");
		else
			System.out.println("You are not allowed to attend exam....");	
	}
}