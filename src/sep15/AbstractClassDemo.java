package sep15;

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure f = new Rectangle();
		f.area();
		f = new Triangle();
		f.area();
	}

}

abstract class Figure{
	int dim1;
	int dim2;
	abstract void area();
	public Figure() {
		// TODO Auto-generated constructor stub
		dim1 = 10;
		dim2 = 20;
	}
}

class Rectangle extends Figure{
	void area() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle Area"+(dim1*dim2));
	}
}
class Triangle extends Figure{
	void area() {
		// TODO Auto-generated method stub
		System.out.println("Triangle Area"+(dim1*dim2/2));
	}
}
