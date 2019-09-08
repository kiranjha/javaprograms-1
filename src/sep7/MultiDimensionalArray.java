package sep7;

public class MultiDimensionalArray {
	public static void main(String[] args) {
//		int a[][]=new int[2][3];
		int a[][]={{1,3,5},{3,5,2}};
		for(int i=0;i<2;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
}
