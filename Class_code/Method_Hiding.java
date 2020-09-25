package Class_code;

class Super
{
	public static void sample()
	{
		System.out.println("Super Class called");
	}
	
	public void sam()
	{
		System.out.println("Non static method Superclass");
	}
}

public class Method_Hiding{
	
	public static void main(String[] args) {
		Super.sample();
		sub.sample();
		Super s = new Super();
		sub sb = new sub();
		s.sam();
		sb.sam();
	}

}

class sub extends Super
{
	public static void sample() {
		System.out.println("Subclass Mehtod called");
	}
	
	public void sam()
	{
		System.out.println("Non static method subclass");
	}

}
