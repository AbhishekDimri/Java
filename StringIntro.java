package String;

public class StringIntro {

	public static void main(String[] args) {
	String name = "Abhi"; //initialization by literals store in pool area (optimized)
	String name2 =  new String("Abhi");//(not optimized)
	String name3 = "Abhi";
	
	System.out.println("Name = " + name);
	System.out.println("Name2 = " + name2);
	System.out.println("Name3 = " + name3);
	
	System.out.println( name == name2);//not referencing to same "Abhi"
	System.out.println(name == name3);// reference to same "Abhi"
	System.out.println(name.equals(name2));//checking the value of these two strings
	System.out.println(name.charAt(0));
	
	String n = "Abhishek Dimri";
	System.out.println(n.length());
	System.out.println(n.substring(9));
	System.out.println(n.substring(4, 8));
	
	System.out.println(n.contains("Abhi"));
	System.out.println(n.isEmpty());
	
	String sam = "    abhi    ";
	System.out.println("|"+sam + "|"+ sam.trim());
	
	}

}
