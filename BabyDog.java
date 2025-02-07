class Animal
{
	void eat()
	{
	System.out.println("Animals can eat");
	}
}
class Dog extends Animal
{
	void bark()
	{
	System.out.println("Dog can bark");
	}
}
class BabyDog extends Dog
{
	void weeping()
	{
	System.out.println("The baby Dog is weeping");
	}
public static void main(String args[])
	{
		Animal a=new Animal();
		Dog d=new Dog();
		BabyDog x=new BabyDog();
		a.eat();
		d.bark();
		x.weeping();
	}
}



