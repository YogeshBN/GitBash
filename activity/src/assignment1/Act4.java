package assignment1;
import java.util.*;
public class Act4 {
public static void main(String args[])
{
	LinkedHashSet<Integer> obj=new LinkedHashSet<>();
	System.out.println("enter no of elements");
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println("enter the elements");
	for(int i=0;i < n;i++)
	{
		int a=sc.nextInt();
		obj.add(a);
	}
	System.out.println(obj);
	Integer[] arr = new Integer[obj.size()];
	arr = obj.toArray(arr);
	System.out.println("Enter the index want to get :");
	int key = sc.nextInt();
	System.out.println("The index of "+key+"is :"+arr[key]);	
}
}