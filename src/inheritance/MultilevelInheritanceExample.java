package inheritance;

class GrandFather
{  
void grandfatherIdentity()
{
	System.out.println("I am Grand-Father");
}  
}  
class Father extends GrandFather
{  
void fatherIdentity()
{
	System.out.println("I am Father");
}  
}  
class Son extends Father
{  
void sonIdentity()
{
	System.out.println("I am Son");
}  
}  
  
public class MultilevelInheritanceExample 
{
	public static void main (String args[])
	{
	Son s = new Son(); 
	s.sonIdentity();
	s.fatherIdentity();
	s.grandfatherIdentity();
	}
	

}
