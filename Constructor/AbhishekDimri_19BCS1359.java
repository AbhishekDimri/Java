package Constructor;

class sample
{
	int x;
	sample()
	{
		System.out.println("This is the default constructor ");
		System.out.println();
	}
	sample(int x)
	{
		this.x = x;
		System.out.println("This is the parameterized constructor usually used to initialize the values to the variable");
		System.out.println("This constructor is taking a intger variable as a parameter and set this value "
				+ "to the variable declared in class");
		System.out.println();
	}
	
	sample(char y)
	{
		System.out.println("This is an example of construtor overloading when there is another constructor is"
				+ " present with same number of parameter");
		System.out.println("The first constructor is taking integer as a parameter and this contructor is taking char as a parameter ");
		System.out.println();
	}
}

public class AbhishekDimri_19BCS1359 {

	public static void main(String[] args) {
		
		System.out.println("Name : Abhishek Dimri");
		System.out.println("UID : 19BCS1359\n");
		
		sample s = new sample();
		sample s1 = new sample(3);
		sample s2 = new sample('y');

	}

}
