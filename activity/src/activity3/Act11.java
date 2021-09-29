package activity3;

import java.util.*;
public class Act11 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in); 
System.out.print("Enter three sides for a triangle: ");
double a = input.nextDouble();
double b = input.nextDouble();
double c = input.nextDouble();int value= (int) a;
if(value < 0)
{
System.out.println("Thank you");
System.exit(value);
}
if((isValid(a,b,c)))
{
System.out.println("The area of the triangle is " + area(a, b, c));
System.out.println("The perimeter of the triangle is " + perimeter(a, b, c));
}
else
{
System.out.println("Input is invalid");
}
}
public static boolean isValid(
double a, double b, double c) {
boolean valid =a + b > c && a + c > b && b + c > a ;
return valid;
}
public static double area(double a, double b, double c) 
{
double s = (a + b + c) / 2;
return Math.sqrt(s * (s - a) * (s - b) * (s - c));
}
public static double perimeter(
double a, double b, double c) {
double s =  a + b + c;
return s;
}
}