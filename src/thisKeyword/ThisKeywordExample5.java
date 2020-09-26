package thisKeyword;

class D
	{ 
	ThisKeywordExample5 obj; 
	D(ThisKeywordExample5 obj)
	{ 
		this.obj=obj; 
	} 
	void display()
	{ 
		System.out.println(obj.data);//using data member of A4 class
	}
	}
public class ThisKeywordExample5 {
	int data=10;
	ThisKeywordExample5()
	{
		D obj2 = new D(this);
		obj2.display();
	}
	public static void main(String[] args)
	{
		ThisKeywordExample5 obj3 = new ThisKeywordExample5();
	}

}
