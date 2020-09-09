package polymorphism;

public class MethodOverloading {
	
	float length;
	float breadth;
	void Room(float x, float y)
	{
		length=x;
		breadth=y;
	}
	void Room(float x)
	{
		length=breadth=x;
	}
	float Area()
	{
		return (length*breadth);
	}
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.Room(10.2f, 2.5f);
		System.out.println(obj.Area());
		obj.Room(10.0f);
		System.out.println(obj.Area());
		
}

}
