package sep15;

public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DailyWorker dw = new DailyWorker("Peter", 2000);
		SalariedWorker sw = new SalariedWorker("Mary", 2000);
		System.out.println("Salary of Peter "+dw.ComPay(18));
		System.out.println("Salary of Mary "+sw.ComPay());
		
	}
}

class Worker {
	int secret;
}

class DailyWorker {
	private String name;
	private int salary;
	
	public DailyWorker(String name, int salary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.salary = salary;
		
		
	}
	
	public int ComPay(int hours) {
		return hours*this.salary;
	}
}

class SalariedWorker {
	private String name;
	private int salary;
	
	
	public SalariedWorker(String name, int salary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.salary = salary;
		
	}
	
	public SalariedWorker() {
		// TODO Auto-generated constructor stub
	}
	
	public int ComPay() {
		return this.salary;
	}
	
}
