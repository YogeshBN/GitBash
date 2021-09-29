package maven1;


class Abc implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
		for(int i=0;i<5;i++)
		{
			
		System.out.println("Current Thread ID: "+ Thread.currentThread().getId());
		
        System.out.println("Current Thread Name: " + Thread.currentThread().getName());
        System.out.println("is Thread alive: "+Thread.currentThread().isAlive());
        System.out.println("Status of the Thread: "+Thread.currentThread().getState());
        System.out.println("Priority of the Thread: "+Thread.currentThread().getPriority());
        
        
        
        Thread.sleep(1000);
		}
		}
		catch(InterruptedException e)//checked exception
		{
			System.out.println(e);
		}
		
		
	}
	
}


public class Act28_2 {

	public static void main(String[] args) {
		Abc at1 = new Abc();
		Thread obj=new Thread(at1);
		Thread obj1=new Thread(at1);
		Thread obj2=new Thread(at1);
		Thread obj3=new Thread(at1);
		
		obj.setName("FirstThread");
		obj1.setName("SecondThread");
		obj2.setName("ThirdThread");
		obj3.setName("FourthThread");
		
		obj.start();
		obj1.start();
		obj2.start();
		obj3.start();
	}
	

}