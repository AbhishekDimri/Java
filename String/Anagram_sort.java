package String;
import java.util.Arrays;

public class Anagram_sort {

	public static void main(String[] args) {
		 
		String a = "listen";
		String b = "silent";
		
		char[] ac = a.toCharArray();
		char[] bc = b.toCharArray();
		
		Arrays.sort(ac);;
		Arrays.sort(bc);
		
		a = new String(ac);
		b = new String(bc);
		
		if(a.equals(b))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}

}
