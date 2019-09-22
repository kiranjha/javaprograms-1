package sep22;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=42/0;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
