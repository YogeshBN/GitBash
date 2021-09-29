package assignment1;


class Calc1
{
	int i,j;
	public int div()
	{
		return i*2;
	}
}
//child thread!
class CalcService implements Runnable
{
	Calc1 obj1;//Object of Calc1 class!
	int a[];
	
	public CalcService(Calc1 obj1, int[] a) 
	{
		super();
		this.obj1 = obj1;
		this.a = a;
	
	}
	@Override
	public void run() 
	{
		try
		{
			
			synchronized(obj1)//class Calc1 Object  
			{
			for(int i=0;i<a.length;i++)
			{
				obj1.notify();
				
				obj1.i=a[i];
				System.out.println("Hen laid the egg "+a[i]);
				System.out.println("Owner gained Rs"+ " "+obj1.div());
				obj1.wait();
			}
			obj1.notifyAll();//final notification to main thread
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Child Thread Over!");

	}

}
public class Act28_5 {

	public static void main(String[] args)throws Exception
	{
		Calc1 c=new Calc1();
		CalcService s1=new CalcService(c,new int[]{1,3,5,7,9});
		CalcService s2=new CalcService(c,new int[]{2,4,6,8,10});
		
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Main Thread Over!");

	}

}