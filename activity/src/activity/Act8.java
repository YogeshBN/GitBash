package activity;
import java.util.Scanner;
public class Act8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Did you have medical cause or not (ENTER 'Y'if you have or 'N' if not )");
		char a = sc.next().charAt(0);
		if(a == 'Y' || a== 'y')
			System.out.print("You are allowed to attend the Exam.");
		else if(a == 'N' || a== 'n')
			System.out.print("You are not allowed to attend the Exam.");		
		else
			System.out.print("Enter a valid Character.");	
	}
}
