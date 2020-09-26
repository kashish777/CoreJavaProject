package staticKeyword;

class Nested
{  
	  static int data=70;  
	  static class Inner
	  {  
	   void msg()
	   {
		   System.out.println("data is "+data);
	   }  
	  }  
	  public static void main(String args[])
	  {  
	  Nested.Inner obj=new Nested.Inner();  
	  obj.msg();  
	  }  
}  