package Abstraction;

public class WagonR  extends Car{

	public void accelarate() {
		System.out.println("WagonR is accelearating");
	}

	@Override
	public void breaking() {
		System.out.println("WagonR is breaking");
		
	}
	
	
}
