package Class_code;

class A
{
	void display()
	{
		System.out.println("Class A");
	}
	
	void display(int a)
	{
		System.out.println("Value = "+ a);
	}
}

class B extends A
{
	void display()
	{
		super.display();
		System.out.println("Class B");
	}
}

public class MainClass {

	public static void main(String[] args) {
		B b = new B();
		b.display();
		
		A a = new A();
		a.display();
		a.display(12);	
		
		String[] n = {"A", "B", "C"};
		
		C.main(n);
		
	}

}

class C extends MainClass
{
	public static void main(String[] args) {
		
		System.out.println("Main Class in Class C " + args[0] + " " + args[1]);	
	} 
}
