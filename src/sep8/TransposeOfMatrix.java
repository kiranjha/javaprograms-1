package sep8;

import java.util.Scanner;

public class TransposeOfMatrix {
	public static void main(String[] args) {
		int a[][] = new int [3][3];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first array");
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j < a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Transpose of a matric:");
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j < a[i].length;j++) {
				System.out.print(a[j][i] + "\t");
			}
			System.out.println();
		}
		
	}
}
