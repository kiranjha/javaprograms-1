package sep8;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account("Peter", 899911, 9000);
		Account acc2 = new Account("Mary", 37777, "Delhi", "Savings Account", 8000);
		
		acc1.get_balance();
		acc1.deposit(29999);
		acc1.get_balance();
		acc1.withdraw(8000);
		acc2.get_balance();
	}

}

class Account{
	private String name;
	private int accountNumber;
	private double amount;
	
	
	public String address;
	public String accountType;
	
	public Account(String name, int accountNumber, double amount) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.accountNumber=accountNumber;
		this.amount=amount;
	}
	
	public Account(String name, int accountNumber, String address, String accountType, double amount) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.accountNumber=accountNumber;
		this.address=address;
		this.accountType=accountType;
		this.amount=amount;
	}
	
	
	public void deposit(double amount) {
		this.amount += amount;
	}
	
	public void withdraw(double amount) {
		this.amount -= amount;
	}
	
	public void get_balance() {
		System.out.println("Account No: "+this.accountNumber);
		System.out.println("Account Name: "+this.name);
		System.out.println("Account Type: "+this.accountType);
		System.out.println("Address: "+this.address);
		System.out.println("Account Balance = Rs." +this.amount);
	}
	
}
