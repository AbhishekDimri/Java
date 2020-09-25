package Exception;

import java.util.Scanner;

public class Exception_handle {

	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner sc  = new Scanner(System.in);
		
		try {
		for(int i=0;i<5;i++)
		{
			a[i] = sc.nextInt();
		}
		
		int n;
		n = sc.nextInt();
		
		System.out.println(a[n]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Check your casting carefully");
		}
		finally{
			System.out.println("sorry for the inconvenience");
		}
		System.out.println("Program Continue without any interruption");
		sc.close();
	}

}
