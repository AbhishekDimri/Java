package inheritance;

public class Teacher extends person{
	
	public Teacher(String name) {
		super(name);
	}
	public void teach() {
		System.out.println(name + " is teaching");
	}
	
	public void eat()
	{
		super.eat();
		System.out.println("Teacher " + name + " is eating");
	}
}
