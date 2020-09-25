package inheritance;

public class person {
	
	protected String name;
	
	public person(String name)
	{
		this.name = name;
	}


	
	public void walk() {
		System.out.println(name + " is walking");
	}
	
	public void eat() {
		System.out.println(name + " is eating");
	}

}
