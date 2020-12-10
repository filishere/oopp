package oopp;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(){
		this(System.currentTimeMillis ());
	}
	
	public Time(long milliseconds){
		setTime(milliseconds);
	}
	
	public Time( int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public void setTime(long milisecs) {
		long milisecondsToday = milisecs % (1000l * 60 * 60 * 24);
	this.hour =	(int) milisecondsToday / (1000 * 60 * 60) ;
    this.minute = (int) (milisecondsToday % (1000 * 60 * 60)) / (1000 * 60);
	this.second = (int) (milisecondsToday % (1000 * 60 * 60)) % (1000 * 60) / 1000;
	}
	public String toString() {
		return  "Hour: " + hour + ", minutes: " + minute + ", seconds: " + second;
	}
}
