package HomeWork;

public class Prog2 {
     public void stuInfo(int roll_no,String name,int std,String address )
     {
    	 System.out.println("roll no. of student="+roll_no);
    	 System.out.println("name  of student="+name);
    	 System.out.println("class of student="+std);
    	 System.out.println("address of student="+address);

     }
	public static void main(String[] args) {
		Prog2 a=new Prog2();
		a.stuInfo(442105, "akii", 12, "at warud,post sewagram,distt wardha");
	}

}
