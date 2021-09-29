package activity;
import java.util.Scanner;
public class Act10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Eggs  :");
		long n = sc.nextLong();
		long gross = n/144;
		long dozen = (n-(gross*144))/12;
		System.out.println("Number of gross :"+gross);
		System.out.println("Number of dozen :"+dozen);
		System.out.println("left over eggs :"+(n-(gross*144)-dozen*12));
	}

}