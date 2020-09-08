package classesObjects;

public class Cars
{

		 int year_of_manufacture; 
		 String color;
		 String model;

		 public static void main(String args[])
		 {  
		  Cars obj =new Cars();
		  obj.year_of_manufacture = 1990;
		  obj.color = "Green";
		  obj.model = "Toyota";
		  System.out.println(obj.year_of_manufacture);  
		  System.out.println(obj.color);  
		  System.out.println(obj.model);  
		  
		  System.out.println("_________________________");
		  Cars obj2 =new Cars();
		  obj2.year_of_manufacture = 1995;
		  obj2.color = "Red";
		  obj2.model = "Ford";
		  System.out.println(obj2.year_of_manufacture);  
		  System.out.println(obj2.color);  
		  System.out.println(obj2.model); 
		  
		  System.out.println("_________________________");
		  Cars obj3 =new Cars();
		  obj3.year_of_manufacture = 2000;
		  obj3.color = "Blue";
		  obj3.model = "Volkswagon";
		  System.out.println(obj3.year_of_manufacture);  
		  System.out.println(obj3.color);  
		  System.out.println(obj3.model);  

		 }  
	

}
