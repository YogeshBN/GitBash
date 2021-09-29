package Finance;
interface Payable
{
	double getPayInfo();
}
class Employee implements Payable
{
	String ename;
	double sal;
	void setData(String fname,double sal)
	{
		this.ename=ename;
		this.sal=sal;
}
	public double getAmount()
	{
		return sal;
	
	}
	void show()
	{
		System.out.println("Name: "+ename);
		}

	@Override
	public double getPayInfo() {
	
		return 0;
	}
}
class Act4
{
	public static void main(String args[])
	{
		Employee e=new Employee();
		e.setData("Ramesh",45666.2);
		double sal=e.getAmount();
		e.show();
		System.out.println("Salary : "+sal);
	}
}
