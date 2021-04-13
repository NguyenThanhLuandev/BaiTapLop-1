package Lop1;

public class Account {
	final int not_success = -1;
	private int id;
	private String name;
	private double balance = 0;
	
	public Account(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Account(int id, String name, double balance) {
		this.id= id;
		this.name =name;
		this.balance = balance;
	}
	public int getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	public double credit(int amount) {
		return amount + balance;
	}
	public double debit(int amount) {
		if(!available(amount)) {
			 return not_success;
		} balance -= amount;
		return balance;
	}
	
	public double transferTo(Account another,int amount) {
		if(available(amount))
			return not_success;
		balance -= amount;
		another.balance += amount;
		return balance;			
	}
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	public boolean available(int amount) {
		return amount <= balance;
	}
}









