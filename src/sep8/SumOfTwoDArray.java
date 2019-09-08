package sep8;

import java.util.Scanner;

public class SumOfTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int [3][3];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first array");
		int sum =0;
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j < a[i].length;j++) {
				a[i][j]=sc.nextInt();
				sum += a[i][j];
			}
		}
		
		System.out.println("Sum = "+sum); 
		
	}

}
