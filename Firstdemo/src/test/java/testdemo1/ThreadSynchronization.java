package testdemo1;




class Parentheses
{
	synchronized void display(String s)
	{
		System.out.print ("(" + s);
	   	try 
		{
	     		Thread.sleep (4000);//4 seconds
	System.out.println("\n\t Current Thread: "
+Thread.currentThread().getName()+ " "+Thread.currentThread().getPriority());
	  	 }
		 catch (InterruptedException e) 
		{
		        System.out.println ("Interrupted");
		}
		 System.out.println(")");//close the ()
	}
}
//child thread 
class MyThread implements Runnable
{
	Parentheses p1;
	String s1;

		public MyThread(Parentheses p1, String s1)
		{
		super();
		this.p1 = p1;
		this.s1 = s1;
		}

		@Override
		public void run() 
		{
			p1.display(s1);//calls CLASS Parantheses 
	
		}
}
public class ThreadSynchronization 
{

	public static void main(String[] args)throws Exception
	{
		Parentheses pobj=new Parentheses();
		Thread t1=new Thread(new MyThread(pobj,"India"));
		Thread t2=new Thread(new MyThread(pobj,"US"));
		Thread t3=new Thread(new MyThread(pobj,"UK"));
		Thread t4=new Thread(new MyThread(pobj,"Australia"));
		
		t1.setName("First Thread");
		t1.start();//run() method called automatically
		t2.setName("Second Thread");
		t2.start();
		t3.setName("Third Thread");
		t3.start();
		t4.setName("Fourth Thread");
		t4.start();
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		System.out.println("Main Thread Over!");
	}
}