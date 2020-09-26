package thisKeyword;

class Student1
	{ 
	int rollno; 
	String name; 
	float fee; 
	Student1(int rollno,String name,float fee) 
	{ 
		this.rollno=rollno; 
		this.name=name; 
		this.fee=fee; 
	} 
		void display() 
		{ 
			System.out.println(rollno+" "+name+" "+fee); 
			} 
		}

public class ThisKeywordExample1 {

	public static void main(String[] args) {
		Student1 obj1 = new Student1(101, "Tom", 8000);
		obj1.display();
		Student1 obj2 = new Student1(102, "Jerry", 10000);
		obj2.display();

	}

}
