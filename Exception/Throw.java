package Exception;

public class Throw {

	public static void main(String[] args) {
		
		fun1();
	}

static void fun1() {
	int a = 5;
	int b = 3;
	
	int c = a/b;
	
	System.out.println(c);
	
	boolean isdanger = true;
	if(isdanger)
	{
		throw new ArrayIndexOutOfBoundsException("Danger!!!!!!!!");
	}
}
}