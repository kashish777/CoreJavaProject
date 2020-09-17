package controlFlow;

public class ifElseIfExample {

	public static void main(String[] args) {
		int marks = 150;
		if(marks >= 35 && marks <= 100)
		{
			System.out.println("Congratulations! Your result is PASS");
		}
		else if(marks < 35)
		{
			System.out.println("Sorry! Your result is FAIL");
		}
		else
		{
			System.out.println("Invalid marks");
		}
	}

}
