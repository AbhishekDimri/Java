package String;

public class Anagram_Alphabet_optimized {

	public static void main(String[] args) {
		boolean isAnagram = true;
		
		String a = "listen!@#$";
		String b = "silent!@#$";
		
		int al[] = new int[256];
		
		for(char c: a.toCharArray())
		{
			int index = (int) c;
			al[index]++;
		}
		for(char c: b.toCharArray())
		{
			int index = (int) c;
			al[index]--;
		}
		
		for(int i=0;i<256;i++)
		{
			if(al[i]!=0) {
				isAnagram = false;
				break;
			}
		}
		
		if(isAnagram)
		 {
			 System.out.println("Anagram");
		 }
		 else
			 System.out.println("Not Anagram");
	}

}
