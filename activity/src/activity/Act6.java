package activity;
import java.util.*;
class Act6 {
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the mark :"+" ");
	int n = sc.nextInt();
	System.out.print("Your grade is :"+" ");
	if(n<25)
		System.out.print('F');
	else if(n>=25 && n<45)
		System.out.print('E');
	else if(n>=45 && n<50)
		System.out.print('D');
	else if(n>=50 && n<60)
		System.out.print('C');
	else if(n>=60 && n<80)
		System.out.print('B');
	else 
		System.out.print('A');
	}

}