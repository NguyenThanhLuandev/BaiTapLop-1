package Lop1;
import Lop1.Car;
public class Car_testmain {

	public static void main(String[] args) {
		Car car = new Car(2020, "Vinfast", 200);
		System.out.println(car.accelerate());
		System.out.println(car.accelerate());
		System.out.println(car.accelerate());
		System.out.println(car.accelerate());
		System.out.println(car.accelerate());
		
		System.out.println(car.brake());
		System.out.println(car.brake());
		System.out.println(car.brake());
		System.out.println(car.brake());
		System.out.println(car.brake());
	}

}
