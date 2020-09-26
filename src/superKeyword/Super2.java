package superKeyword;

class Cat
{  
void eat()
{
	System.out.println("eating...");
}  
}  
class Kitten extends Cat
{  
void eat()
{
	System.out.println("drinking milk...");
}  
void meow()
{
	System.out.println("meowing...");
}  
void work()
{  
super.eat();  
meow();  
}  
}  
class Super2
{  
public static void main(String args[])
{  
	Kitten k=new Kitten();  
	k.work();  
}
}  