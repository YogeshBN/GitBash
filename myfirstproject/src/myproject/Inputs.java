package myproject;

import java.util.Scanner;

public class Inputs {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter ENO: ");
		int eno=s1.nextInt();
		s1.nextLine();
		System.out.println("Enter EmpName: ");
		String name=s1.nextLine();
		System.out.println("Enter Salary: ");
		float salary=s1.nextFloat();
		System.out.println("Emp: " +eno+ " "+name+ " "+salary);
		System.out.printf("%d %s %f", eno,name,salary);
		System.out.printf("%n %b",(25>50));
		
		
		

	}

}
