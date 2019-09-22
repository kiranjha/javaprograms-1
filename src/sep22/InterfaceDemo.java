package sep22;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rabbit rabbit =new Rabbit();
		rabbit.sound();
	}

}

interface Animal
{
	void sound();
}

class Rabbit implements Animal
{
	@Override
	public void sound() {
		// TODO Auto-generated method stub

		System.out.println("Hiiiii");
	}
}