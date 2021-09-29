package activity;
import java.util.Scanner;
public class Act14 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of student's :"+"  ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the mark (0-100) for student"+"  "+(i+1)+"  "+"is :"+"  ");
			arr[i]=sc.nextInt();
			if(arr[i]>100 || arr[i]<0 )
				System.out.print("Invalid input, try again...");
			sum += arr[i];         
			
		}
		double avg = sum/n;
		System.out.printf("Average is : %.2f",avg);
	}

}