package superKeyword;

class Father
{  
int bankBalance =50000;  
}  
class Son extends Father
{  
int bankBalance =30000;  
void print()
{  
System.out.println(bankBalance);  
System.out.println(super.bankBalance);  
}  
}  
class Super1
{  
public static void main(String args[])
{  
Son s = new Son();  
s.print();  
}
}  