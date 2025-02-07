class Animal{
	void display()
	{
		System.out.println("I am in Animal class");
	}
}
class Dog extends Animal{
	void display()
	{
		super.display();
		System.out.println("I am in Dog class");
	}
}
class INTO{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.display();
	}
}
