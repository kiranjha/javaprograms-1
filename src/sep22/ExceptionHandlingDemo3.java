package sep22;

public class ExceptionHandlingDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]= {1,2,3,4,5};
			for (int i=0;i<=a.length;i++) {
				System.out.println(a[i]);
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
