package activity;
import java.util.Scanner;
public class Act11 {
	int a,b;
	void add(int x,int y) 
	{
		a=x;
		b=y;
		System.out.println("Add:: "+(a+b));
	}
	void diff(int x,int y) 
	{
		a=x;
		b=y;
		if(a>b)
			System.out.println("Diff:: "+(a-b));
		else
			System.out.println("Diff:: "+(b-a));
	}
	void mul(int x,int y) 
	{
		a=x;
		b=y;
		System.out.println("Mul:: "+(a*b));
	}
	void div(int x,int y) 
	{
		a=x;
		b=y;
		System.out.println("Div:: "+(a/b));
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter first number :");
	int n1=sc.nextInt();
	System.out.print("Enter second number :");
	int n2=sc.nextInt();
	Act11 cal = new Act11();
	cal.add(n1, n2);//x,y
	cal.diff(n1,n2);
	cal.mul(n1,n2);
	cal.div(n1,n2);

	}

}