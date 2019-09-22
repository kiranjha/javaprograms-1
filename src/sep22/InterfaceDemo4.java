package sep22;

public class InterfaceDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		r.compute_area();
		c.compute_area();
	}

}

interface area
{
	int r = 5;
	double pi=3.14;
	void compute_area();
}
class Rectangle implements area
{
	@Override
	public void compute_area() {
		// TODO Auto-generated method stub
		double a = r*r;
		System.out.println(a);
	}
}

class Circle implements area
{
	@Override
	public void compute_area() {
		// TODO Auto-generated method stub
		double a = pi * r * r;
		System.out.println(a);
	}
}
