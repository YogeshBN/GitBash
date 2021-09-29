package activity;
import java.util.Scanner;
class Student
{
 // Instance Variable
 int rollno,m1,m2,m3;
 String name;    
 
 void getdata()
 {
  Scanner obj13 = new Scanner(System.in);
  System.out.println("Enter Student Name:");
  name = obj13.nextLine();
  System.out.println("Enter roll no:");
  rollno = obj13.nextInt();
  System.out.println("Enter Mark1:");
  m1 = obj13.nextInt();
  System.out.println("Enter Mark2:");
  m2 = obj13.nextInt();
  System.out.println("Enter Mark3:");
  m3 = obj13.nextInt();
   
 }

  
 public static void main( String args[] )
 {
  Student s = new Student();
  s.getdata();
 
  System.out.println("\n\n Student Details:  \n");
  System.out.println("Name: "+s.name);
  System.out.println("Roll no:"+s.rollno);
  System.out.println("Mark1:"+s.m1);
  System.out.println("Mark2:"+s.m2);
  System.out.println("Mark3:"+s.m3);
  //s.cal();  
 } 
}