package Lop1;

public class Employee2 {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee2(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAnnualSalary() {
		return salary*12;
	}
	public int raiseSalary(int percent) {
		this.salary += this.salary * (percent/100.0); 
		return this.salary;
	}
	public String toString() {
		return "Employee2 [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	
}
