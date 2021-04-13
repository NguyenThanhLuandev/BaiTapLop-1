package Lop1;

public class MyTime {
	private int hour;
	private int minute;
	private int second;
	
	public MyTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public MyTime nextSecond() {
		if(hour == 23 && minute == 59 && second == 59) {
			hour = 0;
			minute =0;
			second = 0;
	
		}
		if(minute == 59 && second == 59) {
			hour++;
			minute =0;
			second = 0;
			
		}
		if(second == 59) {
			minute++;
			second = 0;
			
		}
		second++;
		return this;
	}
	public MyTime previousSecond() {
		if(hour == 0 && minute == 0 && second == 0) {
			hour = 23;
			minute = 59;
			second = 59;
			
		}
		if(minute == 0 && second == 0) {
			hour--;
			minute = 59;
			second =59;
		}
		if(second == 0) {
			minute--;
			second = 59;
			
		}
		second--;
		return this;
	}
	public String toString() {
		return String.format("%02d", hour) + ":" + String.format("%02d", minute) +":"+ String.format("%02d", second);
	}
}
