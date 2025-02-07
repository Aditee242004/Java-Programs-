class Vehicle{
	void drive()
	{
		System.out.println("Driving a Vehicle");
	}
}
class Car extends Vehicle{
	void drive(){
	System.out.println("Driving a Car");
	  }

}
class Bike extends Vehicle{
	void drive(){
	super.drive();
		System.out.println("Driving a Bike");
	  }

}
class MainMe{
public static void main(String args[])
{
	Vehicle v=new Vehicle();
	Car c=new Car();
	Bike b=new Bike();
	v.drive();
	c.drive();
	b.drive();
	}
}




		