package inheritance;

public class Singer extends person{
	
	public Singer(String name)
	{
		super(name);
	}
	
	public void sing() {
		System.out.println(name + " is singing");
	}
}
