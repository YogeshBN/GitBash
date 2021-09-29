package myproject;


interface A11
{
	void add();
	void del();
}
abstract class ABC implements A11
{
	@Override
	public void add() 
	{
		System.out.println("ABC::ADD()");			
	}
}
class XYZ extends ABC
{
	@Override
	public void del()
	{
		System.out.println("XYZ:del()");			
	}
}
public class InterfaceDemos {
	public static void main(String[] args) {
		XYZ obj=new XYZ();
		obj.add();
		obj.del();

	}

}
