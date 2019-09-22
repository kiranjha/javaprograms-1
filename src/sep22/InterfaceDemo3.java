package sep22;

public class InterfaceDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1();
		t1.method();
		t1.myanothermethod();
	}

}

interface A1
{
	public void method();
}

interface B1 extends A1
{
	public void myanothermethod();
}

class Test1 implements B1
{
	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("Method");
		
	}
	
	@Override
	public void myanothermethod() {
		// TODO Auto-generated method stub
		System.out.println("myanothermethod");
	}
}