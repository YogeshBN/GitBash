package activity;
import java.util.Scanner;
import java.io.*;
class Shape
{ 
    void Area(float x)
    {
        System.out.println("Area of the Square: "+(x*x)+"  sq units");
    }
    void perimeter(float x)
    {
    	System.out.println("Perimeter of the Square: "+ (4* x)+"  side units");
    }
    void Area(float x, float y)
    {
        System.out.println("Area of the Triange is "+((x*y)+"  sq units"));
    }
    void perimeter(float x,float y)
    {
    	System.out.println("Perimeter of the Square: "+ (2*(x + y ))+"  side units");
    }
} 
class Act12
{ 
    public static void main(String[] args)
    {
    	Scanner sca = new Scanner(System.in);
    	System.out.print("Enter side of a square :");
    	int a = sca.nextInt();
        Shape obj = new Shape();
        obj.Area(a);
        obj.perimeter(a);
        
        
        System.out.print("Enter width of the rectangle :");
        int w = sca.nextInt();
        System.out.print("Enter height of the rectangle :");
        int h = sca.nextInt();
        obj.Area(w,h);
        obj.perimeter(w,h);
       //  System.out.print("Enter the first side of the triangle :");
       // int s1 = sc.nextInt();
       // System.out.print("Enter the second side of the triangle :");
       // int s2 = sc.nextInt();
       // System.out.print("Enter the third side of the triangle :");
       // int s3 = sc.nextInt();
        
    }
}