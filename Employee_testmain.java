package Lop1;

import Lop1.Employee;

public class Employee_testmain {

	public static void main(String[] args) {
		Employee e1 = new Employee("Luan", 123, "Saigontech", "Sinh vien");
		System.out.println(e1);
		Employee e2 = new Employee("Thanh Luan", 789, " ", " ");
		System.out.println(e2);
		Employee e3 = new Employee();
		System.out.println(e3);
		e1.setName("Nguyen Thanh Luan ");
		e1.setIdNumber(20000180);
		System.out.println(e1.getName());
		System.out.println(e1.getIdNumber());
	}
}
