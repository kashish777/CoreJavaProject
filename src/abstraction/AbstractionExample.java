package abstraction;

abstract class Shape
{
abstract void draw();
}
class Rectangle extends Shape
{ 
void draw() 
	{
	System.out.println("drawing rectangle");
	}
} 
class Circle extends Shape
{ 
void draw() 
	{
	System.out.println("drawing circle");
	} 
}
class AbstractionExample {

public static void main(String[] args) {
	
	Shape obj=new Circle();
	obj.draw();
}

}

