package Lop1;

public class Car {

	private int yearModel;
	private String make;
	private int speed = 0;
	
	public Car(int yearModel, String make, int speed) {
		this.yearModel = yearModel;
		this.make = make;
		this.speed = speed;
	}
	public void setYearModel(int yearModel) {
		this.yearModel =yearModel;
	}
	public int getYearModel() {
		return yearModel;
	}
	public void setMake(String make) {
		this.make =make;
	}
	public String getMake() {
		return make;
	}
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public int getSpeed() {
		return speed;
	}
	public int accelerate() {
		speed += 5;
		return speed;
	}
	public int brake() {
		speed -= 5;
		return speed;
	}
}

