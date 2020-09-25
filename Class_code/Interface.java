package Class_code;

interface shape {
	void dimension();
	void color(String s);
	void sign(String s);
}

class Circle implements shape{
	public void dimension()
	{
		System.out.println("Radius = 10");
	}
	
	public void color(String s)
	{
		System.out.println("Color = " + s);
	}
	
	public void sign(String s)
	{
		System.out.println("It is a " + s + " sign");
	}

}

class Rectangle implements shape{
	public void dimension()
	{
		System.out.println("length = 10 and Breadth = 20");
	}
	
	public void color(String s)
	{
		System.out.println("Color = " + s);
	}
	
	public void sign(String s)
	{
		System.out.println("It is a " + s + " sign");
	}
}


public class Interface{

	public static void main(String[] args) {
		Circle c = new Circle();
		c.dimension();
		c.color("Red");
		c.sign("Stop");
		
		Rectangle r = new Rectangle();
		r.dimension();
		r.color("Red");
		r.sign("Speed Limit");
	}
}