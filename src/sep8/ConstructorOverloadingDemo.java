package sep8;

public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoConstructor obj = new DemoConstructor();
		DemoConstructor obj1 = new DemoConstructor(20);
		System.out.println(obj.m);
		System.out.println(obj1.m);
	}

}

class DemoConstructor
{
	int m;
	public DemoConstructor() {
		// TODO Auto-generated constructor stub
		m = 10;
	}
	public DemoConstructor(int m) {
		this.m=m;
	}
}
