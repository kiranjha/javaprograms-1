package sep8;

public class RectangleDemo {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		rect1.set_length(3);
		rect1.set_width(4);
		rect1.setColor("red");
		
		Rectangle rect2 = new Rectangle();
		rect2.set_length(3);
		rect2.set_width(4);
		rect2.setColor("red");
		
		if (rect1.find_area() == rect2.find_area() && rect1.color == rect2.color) {
			System.out.println("Matching Rectangles");
		} else {
			System.out.println("Non matching Rectangles");
		}
	}
}

class Rectangle{
	double width;
	double length;
	double area;
	String color;
	
	public void set_width(double width) {
		this.width = width;
	}
	public void set_length(double length) {
		this.length = length;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double find_area() {
		return width*length;
	}
	
	
}
