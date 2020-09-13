package arrayList;

import java.util.*;
public class ArrayListExample {

	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();    
	      list.add("Mango");   
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");    
	         
	      Iterator itr=list.iterator();  
	      while(itr.hasNext())
	      {
	      System.out.println(itr.next());
	      }
	      
	      list.add(2, "Water-melon");
	      System.out.println(list);

	      list.set(2, "Strawberry");
	      System.out.println(list);

	      list.remove(2);
	      System.out.println(list);

	      Collections.sort(list);
	      System.out.println(list);

	}

}
