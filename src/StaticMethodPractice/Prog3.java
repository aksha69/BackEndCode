package StaticMethodPractice;

public class Prog3 {
	public static void addition()
	{int a=20,b=30,c;
	c=a+b;
	System.out.println("addition of to no="+c);
		
	}
   public static void addition1(int a)
   {
	   int sum=a+a;
	   System.out.println("addition of same no="+sum);
   }
   public static void subtraction(int a,int b)
   {
	   int sub=a-b;
	   System.out.println("subtraction of two no="+sub);
   }
   
	
	
	
	
	public static void main(String[] args) {
		System.out.println("main started");
		addition();
		addition1(5);
		subtraction(10,5);
		System.out.println("main ended");
		
		
		
		
	
	
}

}
