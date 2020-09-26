package thisKeyword;

class E
{ 
	E get() 
	{ 
		return this; 
	} 
	void msg() 
	{ 
		System.out.println("Hello java"); 
	} 
	}  

public class ThisKeywordExample6 {

	public static void main(String[] args) {
	
		 new E().get().msg(); 
		 } 

	}


