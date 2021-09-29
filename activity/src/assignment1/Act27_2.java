package assignment1;

import static java.lang.System.*;

import java.util.Scanner;
public class Act27_2 {

	public static void main(String[] args) {
		
		      
		  String a="The quick brown fox jumps over the lazy dog";
		  int count=0;
		  Scanner sc=new Scanner(System.in);
		  out.println("enter character you need to check its occurance");
		  char b = sc.next().charAt(0);   
		  for(int i=0; i<a.length(); i++)
	    
		  {
			  
		      if(a.charAt(i) == b)
		      count++;
		   }
		  out.println("The Character '"+b+"' appears "+count+" times.");
		  }

	}