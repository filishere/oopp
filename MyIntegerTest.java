package oopp;

public class MyIntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInteger i = new MyInteger(34);
		MyInteger y = new MyInteger(12);
		System.out.println(i.getValue());
		System.out.println(i.isEven());
		System.out.println(i.isPrime());
		System.out.println(y.equals(i));
		char[] a = {'1', '5', '7'};
		System.out.println(MyInteger.parseInt(a));
		 
		
	}

}
