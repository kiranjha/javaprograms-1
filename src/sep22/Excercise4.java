package sep22;

public class Excercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PG_Students pg = new PG_Students();
		pg.Attendance();
		pg.Display_Grade();
		
		UG_Students ug = new UG_Students();
		ug.Attendance();
		ug.Display_Grade();
	}

}

interface Student
{
	public void Display_Grade();
	public void Attendance();
}

class PG_Students implements Student
{
	@Override
	public void Attendance() {
		// TODO Auto-generated method stub
		System.out.println("Attendance of PG_Students");
	}
	@Override
	public void Display_Grade() {
		// TODO Auto-generated method stub
		System.out.println("Display Grade of PG_Students");
		
	}
	
}

class UG_Students implements Student
{
	@Override
	public void Attendance() {
		// TODO Auto-generated method stub
		System.out.println("Attendance of UG_Students");
	}
	@Override
	public void Display_Grade() {
		// TODO Auto-generated method stub
		System.out.println("Display Grade of UG_Students");
	}
}
