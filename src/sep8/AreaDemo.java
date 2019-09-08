package sep8;

public class AreaDemo {
	public static void main(String[] args) {
		Area a =  new Area(3,5);
		System.out.println("Area = " + a.area());
	}
}

class Area{
	private int m;
	private int n;
	
	public Area(int m, int n) {
		// TODO Auto-generated constructor stub
		this.m=m;
		this.n=n;
	}
	
	public int area() {
		return this.m*this.n;
	}
}
