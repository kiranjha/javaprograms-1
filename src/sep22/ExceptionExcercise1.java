package sep22;

public class ExceptionExcercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]= {"Peter", "Mary", "Harry", "Meter"};
		int rollNos[]= {1,2,3,4,5};
		try {
			for (int i=0;i<rollNos.length;i++) {
				System.out.println("Name:"+names[i]);
				System.out.println("Roll No:"+rollNos[i]);
			}
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}
	}

}
