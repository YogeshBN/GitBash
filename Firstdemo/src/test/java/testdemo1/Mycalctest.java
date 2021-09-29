package testdemo1;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/*
 * The @Ignore test annotation is used to ignore particular tests or group of tests in order to skip the build failure.

@Ignore annotation can be used in two scenarios as given below:

    If you want to ignore a test method, use @Ignore along with @Test annotation.
    If you want to ignore all the tests of class, use @Ignore annotation at the class level.

 */
//@Ignore//ignore all test cases!
public class Mycalctest 
{

	int first;
	int second;
	int expectedresult;
	MyCalc obj1;

	/*
	 @BeforeClass annotation specifies that method will be invoked only once, before starting all the tests.
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		System.out.println("@RunOnceBeforeClass-Program Started");
	}
	//@AfterClass annotation specifies that method will be invoked only once, after finishing all the tests.

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@RunOnceAfterClass-Program Ended");
	}
	//@Before annotation specifies that method will be invoked before each test case!
	@Before
	public void setUp() throws Exception {
		System.out.println("@Before: start of the test case");
		obj1=new MyCalc();
		expectedresult=obj1.sum(12, 12);//24
		System.out.println("@BeforeExpected:: "+expectedresult);
	}

	//@After annotation specifies that method will be invoked after each test.
	@After
	public void tearDown() throws Exception {
		System.out.println("@After: End of the test case");
	}

	//first test case!!!!!!!!!!!!!!!!!!!!
	@Test//Testing the MyCalc.java
	public void test()//passed
	{
		System.out.println("My First Test Case!");
		MyCalc obj2=new MyCalc();
		assertEquals(expectedresult,obj2.sum(12, 12));//24,24=>success
		System.out.println("@Test(Expectedresult):: "+expectedresult);
			
	}
	//second test case
	@Test
	public void test1()//passed
	{
		System.out.println("Student Test Case!");
		Student s1=new Student();
		s1.setSid(1001);
		s1.setSname("Thananya");
		//expectedresult,actualresult
		assertEquals(1001,s1.getSid());
		assertEquals("Thananya",s1.getSname());	
	}
	//third test case
	Division obj=new Division(10,2);
	Division obj4=new Division(10,0);
	@Test//
	public void test4()//passed
	{
		System.out.println("Division Test Case!");
		assertEquals(5,obj.divide());//5,5
		//assertEquals(5,obj4.divide());//failed
	}
	//fourth test case
	@Test(expected=ArithmeticException.class)
	public void test5()//failed
	{
		System.out.println("Division Another Test Case!");
		//assertEquals(5,obj.divide());//failed
		assertEquals(5,obj4.divide());//passed
		}
//	@Ignore//this test case alone ignored!
	//fifth test case
		/*	@Test(expected=ArithmeticException.class)
			public void test6()//failed
			{
				throw new NullPointerException();
			}*/


}