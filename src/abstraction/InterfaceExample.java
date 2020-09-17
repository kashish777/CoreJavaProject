package abstraction;

interface Drawable
{  
void draw();  
}  

class Square implements Drawable
{  
public void draw()
{
	System.out.println("drawing square");
	}  
}  
class Hexagon implements Drawable
{  
public void draw()
{
	System.out.println("drawing hexagon");
	}  
}  
class InterfaceExample
{  
public static void main(String args[])
{  
Drawable d=new Hexagon(); 
d.draw();  
}
}  
