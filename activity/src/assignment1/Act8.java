package assignment1;
import static java.lang.System.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
class supplier {
	int supid;
	String supname;
	String supwork;
	public void assign8(int supid, String supname, String supwork) {
		this.supid = supid;
		this.supname = supname;
		this.supwork = supwork;
	}
	@Override
	public String toString() {
		return "Act8 [supid=" + supid + ", supname=" + supname + ", supwork=" + supwork + "]";
	}
}
	public  class Act8
	{
		public static void main(String[] args) throws Exception
		{
			ArrayList obj=new ArrayList();	
			Scanner sc=new Scanner(System.in);
			out.println("Enter the number of suppliers you want to add");
			int n=sc.nextInt();
		    for(int i=0;i<n;i++) {
			out.println("Enter the supplier id");
			int s1=sc.nextInt();
			obj.add(s1);
			out.println("Enter the supplier name");
			String s2=sc.next();
			obj.add(s2);
			out.println("Enter the supplier work");
			String s3=sc.next();
			obj.add(s3);
			out.println("Supplier Details are "+obj.toString());
		    }
			out.println("Enter the supplier id to check if the supplier is present or not");
			int c=sc.nextInt();
			if(obj.contains(c))
			{
				out.println("The supplier with id is present" +c);
			}
		}
		}