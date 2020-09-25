package switchTute;

import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter firs number");
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("Enter the operation");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
		int result = 0;
		switch (operation) {
		case '+':
			result = a+b;
			break;
		case '-':
			result =  a-b;
			break;
		case '*':
			result =  a*b;
		case '/':
			result =  a/b;
			break;
		default:
			System.out.println("Invalid Operation");
			break;
		}
		
		System.out.println("The result is " + result);
		sc.close();
	}

}
