package exceptionHandlingExamples;

public class MultipleCatchExample {

		public static void main(String[] args) 
		  {  
		    try
		    {    
		      int a[]=new int[5];    
		      System.out.println(a[17]);  
		    }    
		    catch(ArithmeticException e)  
		    {  
		      System.out.println("Arithmetic Exception --> "+e);  
		    }    
		    catch(ArrayIndexOutOfBoundsException e)  
		    {  
		      System.out.println("ArrayIndexOutOfBounds Exception --> "+e);  
		    }    
		    catch(Exception e)  
		    {  
		      System.out.println(e);  
		    }   
		    System.out.println("Exception is Handled.");
		    
	}

}
