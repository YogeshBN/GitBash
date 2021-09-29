package myproject;
class MyGeneric<R>
{
	int data;
	
	R data1;
	
	
	public MyGeneric(R data1) 
	{
		super();
		this.data1 = data1;
	}
	
	public R display()
	{
		return data1;
	}

}
public class Generic_character 
{
	public static void main(String[] args) 
	{
		MyGeneric<String> obj=new MyGeneric<>("aaa");
		String a=obj.display();
		System.out.println("Generic(String):: "+a);
		
		MyGeneric<Integer> obj1=new MyGeneric<>(37);
		int a1=obj1.display();
		System.out.println("Generic(Integer):: "+a1);
		
		MyGeneric<Float> obj2=new MyGeneric<>(45.54f);
		float a2=obj2.display();
		System.out.println("Generic(Float):: "+a2);	

	}

}
