package sep22;

public class ExceptionHandling4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]= {1,2,3,4,5};
			a[6]=40/0;
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
