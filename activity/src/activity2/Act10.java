package activity2;
import java.util.*;
class InvalidcodeException extends Exception
{
}
class Act10
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the code");
String code=s.next();
try
{
//for(int i=0;i {
int i = 0;
int ch=(int)code.charAt(i);
if((ch>=48&&ch<=57))
{	
}
else
{
throw new InvalidcodeException();
}

System.out.println("Employee code is :"+code);
}
catch(InvalidcodeException e)
{
System.out.println("Invalid code ");
}
}}
