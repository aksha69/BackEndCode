package StaticMethodPractice;

public class Prog1 {
	
	public static void show()         //static method call from same class
	{
		System.out.println("This is a static show method");
	}
	public static void display()
	{
		System.out.println("This is a static display method");
	}
	

	public static void main(String[] args) {
         System.out.println("main method started");
		show();
		display();
        System.out.println("main method end");

		
		
		
		
	}

}
