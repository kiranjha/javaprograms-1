package sep7;

public class BoxDemo {
	
	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setDim(2, 3, 3);
		
		
		Box b2 = new Box();
		b2.setDim(6, 2, 4);

		
		Box b3 = new Box();
		b3.setDim(4, 8, 6);
		
		b1.volume();
		b2.volume();
		b3.volume();
	}
}

class Box{
	public double height;
	public double depth;
	public double width;
	
	public void volume() {
		double vol = height * depth * width;
		System.out.println("Volume = " + (vol));
	}
	
	public void setDim(double h, double d, double w) {
		height = h;
		depth = d;
		width = w;
	}
	
}
