package sep8;

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.display(1);
		mo.display(1, 2);
		mo.display('c', 2);
		mo.display('d');
	}
}

class MethodOverloading{

	public MethodOverloading() {
		// TODO Auto-generated constructor stub
	}
	public void display(int m) {
		System.out.println(m);
	}
	public void display(int m, int n) {
		System.out.println(m);
		System.out.println(n);
	}
	public void display(char c, int m) {
		System.out.println(c);
		System.out.println(m);
	}
	public void display(char c) {
		System.out.println(c);
	}
}
