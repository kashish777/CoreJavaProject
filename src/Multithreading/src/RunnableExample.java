
public class RunnableExample extends Thread
{
	public void run()
	{  
		System.out.println("thread is running...");  
	}  
		public static void main(String args[])
		{  
		RunnableExample r1=new RunnableExample();  
		r1.start(); 
		r1.run(); //It is okay to call run() method without calling start() method; but it does not start a separate call stack 
		 }  
}

