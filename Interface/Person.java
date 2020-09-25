package Interface;

public class Person implements Student, YouTuber {

	public static void main(String[] args) {
		Person  obj = new Person();
		obj.study();
		obj.makeVideo();

	}

	@Override
	public void makeVideo() {
		System.out.println("person is making video");
		
	}
	
	@Override
	public void study()
	{
		System.out.println("Person is studying");
	}

}
