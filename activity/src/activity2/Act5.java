package activity2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Act5 {
    
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
         try {
            System.out.println("Enter Integer Value: ");
            Integer inputInt = scanner.nextInt(); 
            System.out.println(inputInt);

         } 
         catch (InputMismatchException ex) {
            System.out.println("We have given input as float expecting integer "+ ex);
         }
         try{
             String str = "eleven";
             System.out.println("Character at index 3 = "+str.charAt(3));
             str.charAt(8); 
         }
         catch(StringIndexOutOfBoundsException e){
             e.getMessage(); 
             System.out.println(e+" occurred!");
         }
   }
}