package activity;

import java.util.Scanner;

class Act5 {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your year of service:"+"  ");
    int service = sc.nextInt();
    System.out.print("Enter your salary:"+"  ");
    double salary = sc.nextDouble();

    double bonus=0;
    if(service>6) {
    bonus =	(salary*10)/100;
    }
    System.out.println("service: " + service);
    System.out.println("salary: " + salary);
    System.out.println("bonus: " + bonus);
  
}}