package oopp;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time1 = new Time();
		System.out.println(time1.toString());
		Time time2 = new Time(555550000);
		System.out.println(time2.toString());
		Time time3 = new Time(16, 45, 59);
		System.out.println(time3.toString());
	}

}
