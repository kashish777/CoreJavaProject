package inheritance;

class Vehicle
{
	void drive()
	{
		System.out.println("Driving");
	}
}
class Car extends Vehicle
{
	void honk()
	{
		System.out.println("Driving Car");
	}
}
public class SingleInheritanceExample {

	public static void main(String[] args) 
	{
		Car c = new Car();
		c.drive();
		c.honk();
	}

}
