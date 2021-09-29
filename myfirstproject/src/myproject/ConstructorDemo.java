package myproject;
class Student_Details
{
	int studid;
	String studname;
	float marks;
	void view()
	{
		System.out.println("Student Details:: "+studid+ " "+studname + " "+marks);
	}
	Student_Details()
	{
		System.out.println("NO Argument Constructor Loaded!");
	}
	public Student_Details(int i,String x)
	{
		System.out.println("Para Constructor 1:::::");
		studid=i;
		studname=x;	
	}
	Student_Details(int i,String x,float y)
	{
		System.out.println("Para Constructor 2:::::");
		studid=i;
		studname=x;
		marks=y;
	}}
class Demo
{
		Demo() 
	{ 
		
	}
	Demo(String a)
	{
		System.out.println("Demo Parameterized Constructor::  "+a);
	}
	void Demo()
	{
		
	}
}

public class ConstructorDemo {
	public static void main(String[] args)
	{
		Student_Details d1=new Student_Details();
		Student_Details d2=new Student_Details(1001,"Ramesh",97.0f);
		Student_Details d3=new Student_Details(1002,"Gokul");

		d1.view();
		d2.view();
		d3.view();
		Demo obj2=new Demo("Surya");
		Demo obj3=new Demo();
		obj3.Demo();
	}

}
