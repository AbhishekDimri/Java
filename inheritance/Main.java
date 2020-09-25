package inheritance;

public class Main {

	public static void main(String[] args) {
		Teacher t= new Teacher("Abhi");
		//t.name = "Mr. Harry";
		
		t.eat();
		t.walk();
		t.teach();
		
		Singer s= new Singer("Oprah");
		//s.name = "Oprah";
		s.sing();
		s.eat();
		
		person p = t;
		Teacher t1 = (Teacher)p;
		
		System.out.println(t instanceof Teacher);
		System.out.println(s instanceof Singer);
		System.out.println(t instanceof person);
		
		System.out.println(t1 instanceof person);
		System.out.println(p instanceof Singer);
		System.out.println(p instanceof Teacher);

	}

}
