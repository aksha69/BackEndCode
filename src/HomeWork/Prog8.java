package HomeWork;

public class Prog8 {

	public static void main(String[] args) {            //nested if
		double amount=552.2;
		String pin="visa1";
	
		if(amount==5522.2)
		{
			if(pin=="visa1")
			{
				System.out.println("allow for the payment");
			}else {
				System.out.println("payment is not allowed");
			}
				
		}
		else
		{
			System.out.println("not enough amount");
		}
	}
	
	
		
	

}
