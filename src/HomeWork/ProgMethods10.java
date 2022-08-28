package HomeWork;

public class ProgMethods10 {
	
	public static void addition()           	//static-->
	
	{int a=10,b=20;
	int add=a+b;
	System.out.println("addition of two no.="+add);
	}
	public static void addition1(int a,int b)         //static with parameter
	{
		int k=a+b;
		System.out.println("addition of two no.="+k);
	}
	public static int addition2() {            //static with return type
		int a=10, b=20;
		int x=a+b;
		return x;
	}
	public void addition3()                    //non static
	{
		int a=10,b=2,k;
		k=a+b;
		System.out.println("addition of non static no="+k);
	}
	
		
	

	public static void main(String[] args) {
       addition();
       addition1(10,20);
      System.out.println("addition in return types="+addition2());
    ProgMethods10 j=new  ProgMethods10();
     j.addition3();
      
       
	}

}
