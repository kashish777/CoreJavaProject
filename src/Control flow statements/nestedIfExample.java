
public class nestedIfExample {

	public static void main(String[] args) {

		int Ruby = 8;
		int Ted = 13;
		int Mia = 16;
		
		if(Mia > Ruby)
		{
			if(Mia > Ted)
			{
				System.out.println("Mia is eldest among all");
			}
		}
		
		else if(Ruby > Ted)
		{
			if(Ruby > Mia)
			{
				System.out.println("Ruby is eldest among all");
			}
		}
		
		else
		{
			System.out.println("Ted is eldest among all");
		}
	}

}
