package sep8;

import java.util.Scanner;

public class SumOfOneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first array");
		int sum =0;
		for (int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
			sum += a[i];
		}
		
		System.out.println("Sum = " + sum);
		
		
		
		
	}

}
