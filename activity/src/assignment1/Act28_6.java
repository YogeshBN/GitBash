package assignment1;


class Car1
{

	synchronized void display(String s)
	{
		System.out.println("the vehicle is crossing bridge "+ s);
	   	try 
		{
	     		Thread.sleep (4000);//4 seconds
	System.out.println(s+" "+"vehicle is crossing tollplaza");
	  	 }
		 catch (InterruptedException e) 
		{
		        System.out.println ("Interrupted");
		}
		 System.out.println("allow next");
	}
}
//child thread 
class MThread implements Runnable
{
	Car1 c1;
	String s1;

		public MThread(Car1 pobj, String s1)
		{
		super();
		this.c1 = pobj;
		this.s1 = s1;
		}

		@Override
		public void run() 
		{
			c1.display(s1);//calls CLASS Parantheses 
	
		}
}
public class Act28_6
{

	public static void main(String[] args)throws Exception
	{
		Car1 pobj=new Car1();
		Thread t1=new Thread(new MThread(pobj,"1"));
		Thread t2=new Thread(new MThread(pobj,"2"));
		Thread t3=new Thread(new MThread(pobj,"3"));
		Thread t4=new Thread(new MThread(pobj,"4"));
		Thread t5=new Thread(new MThread(pobj,"5"));
		
		
	
		t1.start();
		t2.start();
		t3.start();
	    t4.start();
		t5.start();
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		System.out.println("Main Thread Over!");
	}
}