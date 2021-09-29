package activity;

import java.util.Scanner;

public class Act9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Product number  :");
		int n = sc.nextInt();
		System.out.print("Enter Quantity sold  :");
		int p = sc.nextInt();
		switch (n)
		{
		default:
			System.out.print("Select the valid product. ");
			break;
		case 1:
			System.out.print("Total price :" + p*22.50);
			break;
		case 2:
			System.out.print("Total price :" + p*44.50);
			break;
		case 3:
			System.out.print("Total price :" + p*9.98);
			break;
		}
	} 

}