import java.util.Scanner;

class Vehicle{
	void startv()
	{
		System.out.println("Vehicle has started");
	}
}
class Car extends Vehicle{
	void startc()
	{
		System.out.println("A car has started");
	}
}
class Method2{
	public static void main(String args[])
	{
		Vehicle v=new Vehicle();
		Car c=new Car();
		v.startv();
		c.startc();
	}
}

	