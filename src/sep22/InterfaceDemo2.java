package sep22;

public class InterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d =new Demo();
		
		d.mymethod();
		d.myanothermethod();
	}

}

interface A
{
	public void mymethod();
}
interface B
{
	public void myanothermethod();
}
class Demo implements A,B
{
	@Override
	public void myanothermethod() {
		// TODO Auto-generated method stub
	
		System.out.println("Hi from myanothermethod");
	}
	
	@Override
	public void mymethod() {
		// TODO Auto-generated method stub
		System.out.println("Hello from mymethod");
		
	}
}

