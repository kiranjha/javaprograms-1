package sep8;

public class DemoProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("abc");
		int a =1,b=2;
		System.out.println("sum="+(a+b));
		Number obj = new Number();
		obj.sum();
			
	}

}

class Number {
	int a;
	int b;
	
	public Number() {
		a=10;
		b=39;
		// TODO Auto-generated constructor stub
	}

	public void sum() {
		System.out.println("sum = "+(this.a+this.b));
	}
}
