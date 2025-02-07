class person{
	String name="Ram";
        int age=30;
	String gender="male";
	void displayp()
	{
		System.out.println("Enter Employee name:"+name);
		System.out.println("Enter Employee age:"+age);
		System.out.println("Enter Employee gender:"+gender);
		
	}
}
class employee extends person{
	int salary=60000;
	String department="Sales";
	void displaye()
	{
		System.out.println("Employee Salary:"+salary);
		System.out.println("Enter Employee Department:"+department);

	}
	public static void main(String args[])
	{
		person p=new person();
		employee e=new employee();
		p.displayp();
		e.displaye();

	}
}




