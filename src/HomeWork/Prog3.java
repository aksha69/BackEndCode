package HomeWork;

public class Prog3 {

	public static void add()
	{
		int a=10;
		int b=20;
		int addition;
		addition=a+b;
		System.out.println("addition of two number=  "+addition);
	}
	public static void sub(int a,int b)
	{
		System.out.println("subtraction of two no="+(a-b));
	}
	public static void div()
	{int a,b,c;
		a=20;
		b=2;
		c=a/b;
		System.out.println("division of two no.="+c); 
		
	}
	
	public static void main(String[] args) {
      add();
      sub(10,20);
      System.out.println("multiplication of two no.="+(10*20));
		div();
		
		
	}

}
