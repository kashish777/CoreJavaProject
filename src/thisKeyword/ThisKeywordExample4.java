class C 
{ 
	void m(C obj) 
	{ 
		System.out.println("method is invoked"); 
	} 
	void p() 
	{ 
		m(this); 
	}
}

public class ThisKeywordExample4 {

	public static void main(String[] args) {
		C obj= new C();
		obj.p();
	}

}
