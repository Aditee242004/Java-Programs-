class person{
	String name="Ram";
        int age=30;
	String gender="male";
	void displayp()
	{
		System.out.println("Employees Details:");
	}
}
class employee extends person{
	int salary=60000;
	String department="Sales";
	void displaye()
	{
		System.out.println("Company Employee Details:");
	}
	public static void main(String args[])
	{
		employee e=new employee();
		person p=new person();
		e.displaye();
		p.displayp();
	}
}




