package sep8;

public class EmployeeDemo {
	
	public static void main(String[] args) {
		Employee e1=new Employee(1001, "Peter", "CEO");
		Employee e2=new Employee(1002, "Mary", "Manager");
		Employee e3=new Employee(1003, "John", "HR");
		Employee e4=new Employee(1004, "Steve", "Developer");
		Employee e5=new Employee(1005, "Sarah", "Devops");
		
		
		System.out.println("Employee Details");
		
		e1.print();
		e2.print();
		e3.print();
		e4.print();
		e5.print();
	}
}

class Employee
{
	public Employee(int id, String name, String designation) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.designation=designation;
	}
	private int id;
	private String name;
	private String designation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void print() {
		System.out.println("=====================================");
		System.out.println("ID:\t\t\t"+this.id);
		System.out.println("Name:\t\t\t"+this.name);
		System.out.println("Designation:\t\t"+this.designation);
		System.out.println("======================================");
	}
	
}
