package maven1;

class VendorThread  implements Runnable
{
	@Override
	public void run() 
	{
		System.out.println("Child Thread Name:: "+Thread.currentThread().getName());
		try
		{
			for(int i=0;i<5;i++)
			{
			Thread.sleep(2000);
			System.out.println("Vendor Child Thread: "+i + " "+Thread.currentThread().getName());
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("Vendor thread enters into DEAD state!");
		System.out.println("Vendor thread completed!!!");	
	}
}

public class Threadrunnabledemo
{
	
	public static void main(String[] args) 
	{
		VendorThread vt1=new VendorThread();
		
		Thread obj=new Thread(vt1);
		Thread obj1=new Thread(vt1);

		System.out.println("1st Thread alive?? "+obj.isAlive());
		System.out.println("2nd Thread alive?? "+obj1.isAlive());
		
		obj.setName("AddThread");
		obj1.setName("DelThread");

		obj.start();
		obj1.start();
		
				
		System.out.println("1st Thread alive?? "+obj.isAlive());
		System.out.println("2nd Thread alive?? "+obj1.isAlive());
		System.out.println("Total number of Threads?? "+Thread.activeCount());

		try
		{
			for(int i=0;i<5;i++)
			{
			Thread.sleep(4000);
			System.out.println("Main Thread:: "+i);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Main Thread completed!");



	}
}