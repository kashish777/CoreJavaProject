package superKeyword;

class Chocolate
{  
Chocolate()
{
	System.out.println("eating chocolate");}  
}  
class Icecream extends Chocolate
{  
Icecream()
{  
super();  
System.out.println("eating icecream");  
}  
}  
class Super3
{  
public static void main(String args[])
{  
Icecream obj = new Icecream();  
}
}  
