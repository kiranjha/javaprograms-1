package sep7;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println("Enter a power");
		int p = sc.nextInt();
		int result = n;
		for(int i=2;i<=p;i++) {
			result *= n;
		}
		System.out.println("Power of  a number = "+result);
	}
}
