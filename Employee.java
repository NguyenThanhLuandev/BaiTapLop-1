package Lop1;

public class Employee {
	
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public Employee(String name, int idNumber, String department, String position) {
		this.name = name;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position;
	}
	public Employee(String name, int idNumber) {
		this.name = name;
		this.idNumber = idNumber;
		this.department = "";
		this.position = "";
	}
	public Employee() {
		this.name = "";
		this.department = "";
		this.position = "";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPosition() {
		return position;
	}
	public String toString() {
		return "Employee [name= " + name + ", idNumber= " + idNumber + ", department= " + department + ", position= "
				+ position + "]";
	}
}

