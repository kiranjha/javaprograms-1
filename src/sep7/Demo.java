package sep7;


class Animal
{
	public void action() {
		System.out.println("asd");
	}
}

class Human extends Animal{
	public void action() {
			System.out.println("walk");
		}
}

class Monkey extends Animal{
	public void action() {
		System.out.println("jump");
		}
}

public class Demo {
	public static void main(String[] args) {
		Animal a = new Animal();
		a = (Human)a;
//		a = new Monkey();
		a.action();
		
		
	}
}
