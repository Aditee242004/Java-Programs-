class Shape{
	void getAreas()
	{
		System.out.println("Area of Shape is:");
	}
}
class Rectangle{
		int length=20;
		int width=30;
		int result;
		void getArear()
		{
			result = length*width;
			System.out.println("result");

		}
}
class MainMethod{
public static void main(String args[])
	{
		Shape s=new Shape();
		Rectangle r=new Rectangle();
		s.getAreas();
		r.getArear();
	}
}


