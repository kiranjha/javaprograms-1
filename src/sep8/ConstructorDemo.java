package sep8;

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoProgram d = new DemoProgram();
//		d.display();
	}

}

class Demo{
	int m;
	int n;
	
	public Demo() {
		// TODO Auto-generated constructor stub
		m=10;
		n=20;
	}
	void display() {
		System.out.println(m+"\t"+n);
	}
}