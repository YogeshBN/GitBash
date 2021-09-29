package assignment1;


import java.util.Scanner;


public class Bank
{
	static String accNo;  
	static String custName; 
	static int custGender;  
	static String custJob;  
	static double curBal;
	static int n;
   


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number: ");
		accNo = sc.nextLine();
		System.out.println("Enter customer name: ");
		custName = sc.nextLine();
		System.out.println("Gender 1.Male 2.Female: ");
		custGender=sc.nextInt();
		System.out.println("Enter job: ");
		custJob = sc.next();
		System.out.println("Enter current Balance: ");
		curBal= sc.nextDouble();
		System.out.println("Choose the account   1.current account 2.savings account: ");
		n = sc.nextInt();
		if(n==1)
		{
			Current.calcBalance();
		}
		else if(n==2)
		{
			Saving.calcBalance();
		}
		else
		{
			System.out.println("Invalid");
		}
		
		   
		
				
		
		
		
		
	}

}
