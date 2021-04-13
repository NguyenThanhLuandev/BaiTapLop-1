package Lop1;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	private boolean isDay(int day) {
		return day >0 && day < 32;
	}
	private boolean isMonth(int month) {
		return month > 0 && month < 13;
	}
	private boolean isYear(int year) {
		return year > 1900 && year < 9999;
	}
	
	public void setDay(int day) {
		if(isDay(day))
			this.day = day;
	}
	public void setMonth(int month) {
		if(isMonth(month))
			this.month = month;
	}
	public void setYear(int year) {
		if(isYear(year))
			this.year = year;
	}
	public int getDay() {
		return this.day;
	}
	public int getMonth() {
		return this.month;
	}
	public int getYear() {
		return this.year;
	}
	public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String toString() {
		return String.format("%02d", this.day) + "/" + String.format("%02d", this.month) + "/" + year;
	}
	
}
