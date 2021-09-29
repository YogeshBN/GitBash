package myproject;

public class GarbageCollectionDemo
{
	
	@Override
	protected void finalize() throws Throwable 
	{
		System.out.println("GC Tool invoke in some few mins!!");
		System.out.println("GC Tool calls object :::" +this.getClass());
	}

	public static void main(String[] args) 
	{
		GarbageCollectionDemo obj=new GarbageCollectionDemo();
		GarbageCollectionDemo obj1=new GarbageCollectionDemo();
		obj=null;
		System.gc();
		System.out.println("1st Object GC Process Loaded!");
		obj1=null;
		Runtime r1=Runtime.getRuntime();
		r1.gc();
		System.out.println("2nd Object GC Process Loaded!");
		System.out.println("GC Process Completed!");

	
	}
}