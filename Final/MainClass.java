package Final;

public final class MainClass extends Student{
	//Now this class cannot be inherited
	final int Tr = 4; //we have to initialize the value of final global variable 
	
	
//	public void getdescription()
//	{
//		System.out.println("Inside Main Class");
//	}
//	we cannot override Final method
	
	public static void main(String[] args) {
		final String name =  "Abhi ";
		final int Rollno;
		Rollno = 4;
		
		System.out.println(name + Rollno);
		
		final Student obj = new Student();
		Student obj2 = new Student();
		
		obj.name = "abhi";

		MainClass ob = new MainClass();
		ob.getdescription();
		
		
	}

}