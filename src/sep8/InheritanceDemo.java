package sep8;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B(1,2);
		System.out.println("Sum = " + b.sum());
		b.display();
	}

}

class A
{
	int a;
	String color="white";
	public A(int a) {
		// TODO Auto-generated constructor stub
		this.a=a;
	}
}

class B extends A{
	int b;
	String color="blue";
	
	public B(int a, int b) {
		// TODO Auto-generated constructor stub
		super(a);
		this.b = b;
	}
	
	public int sum() {
		return a+b;
	}
	public void display() {
		System.out.println(color);
	}
}
