package myproject;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map1
{
	public static void main(String[] args)
	{
		LinkedHashMap<Integer,String> obj=new LinkedHashMap<>();//key,value
		obj.put(3, "aaa");
		obj.put(2, "ccc");
		obj.put(6, "bbb");
		
		System.out.println("LinkedHashMap(Ordered):: "+obj);

		TreeMap<Integer,String> obj1=new TreeMap<>();
		obj1.put(3, "aaa");
		obj1.put(2, "ccc");
		obj1.put(6, "bbb");
		System.out.println("TreeMap(Sorted):: "+obj1);
		
	
		Hashtable<Integer,String> obj2=new Hashtable<>();
		obj2.put(3, "aaa");
		obj2.put(2, "ccc");
		obj2.put(6, "bbb");
		System.out.println("HashTable:: "+obj2);
	}
}
