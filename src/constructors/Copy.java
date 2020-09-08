package constructors;

	
	class Copy
	{  
	    int id;  
	    String name;  
	    Copy(int i,String n)
	    {  
	    id = i;  
	    name = n;  
	    }  
	    Copy(Copy c)
	    {  
	    id = c.id;  
	    name =c.name;  
	    }  
	    void display()
	    {
	    	System.out.println(id+" "+name);
	    }  
	   
	    public static void main(String args[])
	    {  
	    Copy c1 = new Copy(111,"Rohan");  
	    Copy c2 = new Copy(c1);  
	    c1.display();  
	    c2.display();  
	   }  
	  

}
