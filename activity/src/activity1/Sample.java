package activity1;

class vehicle
{
	String color;
	int wheels;
	String model;
 vehicle(String color,int wheels,String model)
{
 this.color=color;
 this.wheels=wheels;
 this.model=model;
 System.out.println("color::"+color+ "    " +"wheels::"+wheels+"      "+"model::"+model);
}
	public void uses() {
		System.out.println("vehicle uses in our daily life");
	}
	public void type()
	{
		System.out.println("vehicles classified into 3 types  light , mid , heavy");
	}

}

class Truck extends vehicle
{
	Truck(String color, int wheels, String model) {
		super(color, wheels, model);
		// TODO Auto-generated constructor stub
	}

	public void type()
	{ super.type();
		System.out.println("Heavy Loaded!");
	}
}

class Bus extends vehicle
{
	Bus(String color, int wheels, String model) {
		super(color, wheels, model);
			}

	public void type()
	{
		System.out.println("mid Loaded!");
	}
}

class Car extends vehicle
{
	Car(String color, int wheels, String model) {
		super(color, wheels, model);
		// TODO Auto-generated constructor stub
	}

	public void type()
	{
		System.out.println("Light Loaded!");
	}
}

class Sample {
	public static void main(String[] args)
	{
	Truck obj1 = new Truck("orange",10,"Leylend");
	Bus obj2 = new Bus("white",8,"Leylend");
	Car obj3 = new Car("Red",4,"Renault");
	
	
	obj1.type();
	obj2.type();
	obj2.uses();
	obj3.type();
	
	}

}