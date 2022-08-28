package HomeWork;

public class ProgMethod13_1 {
	public static void show()
	{
		String name="akii";int age = 22;double sal=55265.6;      //no parameter
		System.out.println("name of employ="+name);
		System.out.println("age of employ="+age);
		System.out.println("sal of employ="+sal);

	}  
	public void info(String name,int age,double sal) 
	{                                                      //with parameter
		System.out.println("name of employ="+name);
		System.out.println("age of employ="+age);
		System.out.println("sal of employ="+sal);
	}
	public String info()
	{
		String name="akii";
		return name;
	}
	
	

	public static void main(String[] args) {
        show();
        ProgMethod13_1 g=new  ProgMethod13_1();
        g.info("akii", 26, 55213.23);
        System.out.println("name"+g.info());
	}

}
