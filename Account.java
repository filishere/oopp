package oopp;

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private static double yearInterestRate = 4.5;
	private Date dateCreated = new Date();
	
	Account(){

	}
	Account (int id, double balance){
		this.setId( id) ;
		this.setBalance(balance);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getYearInterestRate() {
		return yearInterestRate;
	}

	public static void setYearInterestRate(double yearInterestRate) {
		Account.yearInterestRate = yearInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public static double getMonthlyInterestRate() {
		return yearInterestRate / 12;
	}
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate() / 100;
	}
	public void withdraw(double sumToWithdraw){
		if(sumToWithdraw < 0 || balance < sumToWithdraw){
			System.out.println("Error");
			return;
		}
		balance -= sumToWithdraw;
	}
	public void deposit(double sumToDeposit){
		if(sumToDeposit < 0){
			System.out.println("Error");
			return;
		}
		balance += sumToDeposit;
	}
}
