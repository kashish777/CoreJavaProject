package staticKeyword;

class Cube
{  
	  static int cube(int x)
	  {  
	  return x*x*x;  
	  }  
	  
	  public static void main(String args[])
	  {  
	  int result=Cube.cube(4);  
	  System.out.println(result);  
	  }  
	}  