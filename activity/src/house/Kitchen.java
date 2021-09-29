package house;
import java.util.*;
import static java.lang.System.*;
public class Kitchen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		out.print("Enter the length of the array  :");
		int n = sc.nextInt();
		out.println("Enter the Elements in the array  :");
		int appliances[] = new int[n];
		for(int i=0;i<n;i++)
		{
			appliances[i]=sc.nextInt();
		}
		out.print("output before copying  :");
		for(int i=0;i<n;i++) {
			out.print(appliances[i]+",");
		}
		
		int arr[]=new int[n];		
		for(int i=0;i<n;i++)
		{
			arr[i]=appliances[i];
		}
		out.println("");
		out.print("output after copying  :");
		for(int i=0;i<n;i++)
		{
			out.print(arr[i]+",");
		}
	}

}