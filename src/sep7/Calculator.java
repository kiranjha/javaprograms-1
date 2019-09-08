package sep7;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println("Enter your choice");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		int ch = sc.nextInt();
		int result = 0;
		switch(ch) {
		case 1: result = n1+n2;break;
		case 2: result = n1 - n2;break;
		case 3: result = n1 * n2;break;
		case 4: result = n1/n2;break;
		default: System.out.println("Wrong Choice");
		}
		
		System.out.println("Result = "+result);
		
		
		
	}
}
