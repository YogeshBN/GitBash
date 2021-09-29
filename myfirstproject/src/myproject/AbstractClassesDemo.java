package myproject;

abstract class Admin57
{
	void disp() 
	{ 
	}
}

abstract class Shopping1_4
{
	void offers()
	{
		System.out.println("10-30% discount");
	}	
	abstract void paymentgateway();
	abstract void delivery();
}
abstract class Amazon extends Shopping1_4
{

	@Override
	void paymentgateway() 
	{
		System.out.println("Amazon::paytm,paypal!");				
	}
	
}
class Myntra1 extends Shopping1_4
{
	@Override
	void paymentgateway() 
	{
		System.out.println("Myntra::paytm,paypal!");	
	}
	@Override
	void delivery() 
	{
		System.out.println("10days notice!");		
	}
	void feedback()
	{
		System.out.println("Good!");
	}	
}
public class AbstractClassesDemo 
{
	public static void main(String[] args) 
	{
		Myntra1 obj=new Myntra1();
		obj.paymentgateway();
		obj.delivery();
		obj.feedback();
		obj.offers();
		Shopping1_4 obj1=new Myntra1();
		obj1.paymentgateway();
		obj1.delivery();
		obj1.offers();
		((Myntra1)obj1).feedback();

		
	}
}