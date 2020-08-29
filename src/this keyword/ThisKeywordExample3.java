class B
{ 
	B() 
	{ 
		System.out.println("hello b"); 
	} 
	B(int x) 
	{ 
		this(); 
		System.out.println(x); 
		} 
	}

public class ThisKeywordExample3 {

	public static void main(String[] args) {
		
		B obj = new B(10);
	}

}
