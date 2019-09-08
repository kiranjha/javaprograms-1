package sep8;

import java.util.Scanner;

public class Marksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total marks of one subject");
		int totalMarks = sc.nextInt();
		System.out.println("Enter marks of 5 subjects");
		int sum =0;
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Enter marks of subject : "+ (i+1));
			a[i] = sc.nextInt();
			sum += a[i];
		}
		System.out.println();
		System.out.println("Sum of marks = " + sum);
		System.out.println();
		System.out.println("Average of marks = " + (sum/a.length));
		System.out.println();
		System.out.println("Percentage of marks:");
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Percent of Subject"+ (i+1) + " : " + (a[i]*100/totalMarks) + "%");
		}
		
		
	}

}
