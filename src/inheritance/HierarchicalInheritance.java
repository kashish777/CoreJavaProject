package inheritance;

class Bird
{  
void eat()
{
	System.out.println("eating...");
}  
}  
class Eagle extends Bird
{  
void hawk()
{
	System.out.println("hawking...");
}  
}  
class Penguin extends Bird
{  
void roar()
{
	System.out.println("roaring...");
}  
}    

public class HierarchicalInheritance 
{

	public static void main(String[] args) 
	{
		Penguin p=new Penguin();  
		p.roar();  
		p.eat();  
		//p.hawk();//C.T.Error  
		
	}

}
