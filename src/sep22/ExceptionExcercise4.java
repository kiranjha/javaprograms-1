package sep22;

public class ExceptionExcercise4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Car car1=new Car("up");
		Car car2=new Car("down");
		if (!car1.getDirection().equals(car2.getDirection())){
			throw new Exception("Oppsite Direction");
		}

	}

}

class Car{
	private String direction;
	public Car(String direction) {
		this.setDirection(direction);
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	
	
}
