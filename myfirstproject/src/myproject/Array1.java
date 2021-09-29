package myproject;
import java.util.Scanner;

public class Array1 {
	public int[] disp()
	{
		//int a[]= {100,200,300};
		return new int[] {12,45,576};
	
	}
	public static void main(String[] args)
	{
		//int salary[]=new int[10];
		int[] salary1=new int[10];
		
		salary1[0]=60500;
		salary1[1]=84500;
		salary1[2]=15500;
		salary1[3]=56500;
		salary1[4]=68500;
		System.out.println("Salary:: "+salary1[1]+ " "+salary1[7]+ " Length:: "+salary1.length);
	
		for(int i=0;i<salary1.length;i++)
		{
			System.out.println(salary1[i]);
		}

		System.out.println("Enter The Array Size:: ");
		Scanner s1=new Scanner(System.in);
		int arraysize=s1.nextInt();
		System.out.println("Enter the "+arraysize + " values::");
		int a[]=new int[arraysize];
		System.out.println("Array Size:: "+a.length);

		for(int i=0;i<a.length;i++)
		{
			a[i]=s1.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
System.out.println("\nArray Initialization:: ");
		
		String Names[]= {"Ramesh","Yogi","Surya","Jaya","Gokul"};
		//String Names1[]= new String[]{"Ramesh","Yogi","Surya","Jaya","Gokul"};
		
		for(int i=0;i<Names.length;i++)
		{
			System.out.print(Names[i]+ " ");
		}
		for(String s:Names)
		{			
        	System.out.print(s+ " ");
        }

		System.out.println("\nFor Each Loop(Method):::");
		Array1 obj=new Array1();
		int s[]=obj.disp();
		for(int i:s)
		{
			System.out.print(i + " ");
		}

	}}


