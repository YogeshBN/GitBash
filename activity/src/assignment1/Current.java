package assignment1;

import java.util.Scanner;

public class Current extends Bank
{
	static int fixedDep;   
	static double curRate=0.08;
	static double bal;
	static int servFee;
	
	
	
	
	
	
	static void calcBalance()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Are you having FD 1.Yes 2.No: ");
		int n = obj.nextInt();
		if(fixedDep==1)
		{
			curBal = curBal - 150;
			
			//System.out.println("The Balance is"+curBal);
			bal = (int) (curBal + ( curRate * curBal ));
			System.out.println("The CurrentAccount Bal is: "+bal);
		}
		else
		{
			bal = (int) (curBal + ( curRate * curBal ));
			System.out.println("The CurrentAccount Bal is: "+bal);
		}
		
	}
	
}