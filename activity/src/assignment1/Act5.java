package assignment1;

import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Act5
	{

		public static void main(String[] args) 
		{
			ArrayList obj=new ArrayList();
			Scanner sc=new Scanner(System.in);
			out.println("Enter number of days you want to store");
			int n=sc.nextInt();
			out.println("Enter names of the day");
			for(int i=0;i<n;i++) {
			String a =sc.next();
            obj.add(a);
            
			}
			int s= obj.size();
            out.println("Size of an array list is" + s);
            Object[] objects = obj.toArray();
            for (Object obj1 : objects)
                System.out.print(obj1 + " ");
		}
		
	}

