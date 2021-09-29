package myproject;
class Bank
{
	int code=6566;
	public void options()
	{
		System.out.println("account,savings,withdraw");
	}
	public void show()
	{
		System.out.println("Bank Class Show()");
	}
}
class Hdfc extends Bank
{
	int code=7968;
	public void withdraw()
	{
		System.out.println("Withdraw");
	}
	public void saving()
	{
		System.out.println("Saving");
	}
	public void show()	
	{
		super.show();
		System.out.println("Hdfc class Show()");
		System.out.println("CODE:: "+ " "+code + " "+ this.code + " "+super.code);				
	}
}
class Axis extends Bank
{
	public void facilities()
	{
		System.out.println("Loans,min intrest");
	}

}


public class Inheritance1
{
	public static void main(String[] args)
	{
		Hdfc h1=new Hdfc();
		Axis a1=new Axis();
		h1.withdraw();
		h1.saving();
		h1.show();
		a1.options();
		a1.facilities();

	
	}
}
