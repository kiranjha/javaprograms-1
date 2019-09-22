package sep22;

public class Excercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test(90,4);
		t.division();
		t.modules();
	}

}

interface Operations
{
	public void division();
	public void modules();
}

class Test implements Operations
{
	private int a;
	private int b;
	public Test(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
		
		
	}
	@Override
	public void division() {
		// TODO Auto-generated method stub
		System.out.println("Division="+(a/b));
		
	}
	@Override
	public void modules() {
		// TODO Auto-generated method stub
		System.out.println("Modules="+(a%b));
	}
}

