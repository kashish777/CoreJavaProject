package methods;

class Display {

    public static void main(String[] args) {

        Output obj = new Output();
        System.out.println("About to encounter a method.");

        obj.myMethod();

        System.out.println("Method executed successfully!");
    }
}

class Output {
  
    public void myMethod() 
    {
        System.out.println("Printing from inside myMethod().");
    }
}
