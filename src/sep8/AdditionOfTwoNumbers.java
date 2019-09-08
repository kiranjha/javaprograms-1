package sep8;

public class AdditionOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numbers num = new Numbers(2,4);
		System.out.println("Sum of numbers: "+ num.sum());
	}

}

class Numbers {
	private int a;
	private int b;
	
	public Numbers(int a , int b) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int sum() {
		return this.a + this.b;
	}
	
}
