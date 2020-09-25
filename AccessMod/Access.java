package AccessMod;

class A
{
	int a = 10;
	
	private int b = 20;
	
	protected int c= 30;
	
	public int d = 40;
		
}


public class Access {
	
	public static final char[] a = null;
	public int x=12; 
	private int y=13;
	protected int z=14;
	int w =15;

	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a.a);
		//System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
	}

}
