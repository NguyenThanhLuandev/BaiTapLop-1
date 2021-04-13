package Lop1;

import Lop1.Employee2;

public class Employee2_testmain {

	public static void main(String[] args) {
		Employee2 e1 = new Employee2(123, "Nguyen", "Luan", 50000);
		System.out.println(e1);
		System.out.println(e1.getFirstName());
		System.out.println(e1.getAnnualSalary());
		System.out.println(e1.raiseSalary(50));
		
	}

}
