package testdemo1;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Assertiontestdemo {


	@Test
	public void mytest1()
	{
		String obj1="junit";//String pool memory
		String obj2="junit";//String pool memory
		String obj3=new  String("test");//Heap
		String obj4="test";//Pool
		String obj5=null;
		int var1=1;
		int var2=2;
		int[] arithmetic1= {1,2,3,4,5};
		int[] arithmetic2= {1,2,3,4};
		
		//The assertEquals() method compares two objects for equality,
		//using their equals() method. 

		assertEquals(obj3,obj4);
		assertEquals(obj1,obj2);

		//Check if two object references 
		//point to the same object TYPE
		
		//assertSame(obj3,obj4);//failure  bcos one is heap and another one is pool!
		assertSame(obj1,obj2);

		//Check if two object references 
		//not point to the same object type
		assertNotSame(obj3,obj4);//different memory returns true
		//assertNotSame(obj1,obj2);//same memory returns false
		
		//Check that an object isn't null
		assertNotNull(obj1);
		
		//Check that an object is null
		assertNull(obj5);
			
			//Check that a condition is true
			assertTrue(var1 < var2);

			//Check that a condition is false
			assertFalse(var1 > var2);//1>2
			
			// Check whether two arrays are 
			//equal to each other.
			//assertArrayEquals(arithmetic1,arithmetic2);
			
	}
}
