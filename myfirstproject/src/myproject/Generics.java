package myproject;

import java.util.ArrayList;
import java.util.List;

/*
 * 1.List<?>=>unbounded wild card 
 * 
 * 2.List<? extends Throwable>=>upper bounded wildcard
 * Throwable and the sub classes of Throwable
 * ex:List<? extends Number>
 * Number+all wrapper classes
 * 
 * 3.List<? super Integer>=>Lower bounded wildcard
 * Integer and its super type(like Number,Object)!
 */
abstract class Shopping11 extends Object
{
	abstract void offers();
}
class Myntra11 extends Shopping11
{
	@Override
	void offers() 
	{
		System.out.println("Myntra::: 30%-50% discount");	
	}
}
class ShoppersStop11 extends Shopping11
{
	@Override
	void offers() 
	{
		System.out.println("ShoppersStop::: 30%-50% discount");	
	}
}
public class Generics 
{
	static void display(List<? extends Shopping11> obj1)
	{
		for(Shopping11 i : obj1)
		{
			i.offers();
		}
	}
	public static void main(String[] args) 
	{
		ArrayList<Myntra11> obj=new ArrayList<>();
		obj.add(new Myntra11());
		obj.add(new Myntra11());

		ArrayList<ShoppersStop11> obj1=new ArrayList<>();
		obj1.add(new ShoppersStop11());
		obj1.add(new ShoppersStop11());
		
		display(obj);
		display(obj1);
		
		

		
	}

}
