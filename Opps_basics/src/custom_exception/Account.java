package custom_exception;

import opps_language_fundamental.Employee1;

public class Account {
	private String account_holder_name;
	private int accno;
	private double balance;
	
	public Account(String account_holder_name, int accno, double balance) {
		super();
		this.account_holder_name = account_holder_name;
		this.accno = accno;
		this.balance = balance;
	}
	
	public String getAccount_holder_name() {
		return account_holder_name;
	}
	
	public void setAccount_holder_name(String account_holder_name) {
		this.account_holder_name = account_holder_name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAccno() {
		return accno;
	}
	public void deposite(double amt) {
		this.balance=this.balance+amt;
	}
	public double withdraw(double amt) throws InsufficientBalanceException,ZeroBalanceException
	{	
		if(this.balance==0.0){
		throw new ZeroBalanceException(this.balance,amt,this.accno);}
	
		if(amt<this.balance) {
			this.balance=this.balance-amt;
			System.out.println("Current  Balance is "+this.balance+"amount widrawn is"+amt);
			
		}
		else {
			//throw a custom exception InsufficientBalance 
			throw new InsufficientBalanceException(this.balance,amt,this.accno);
			//System.out.println("Insufficient Balance Exception"+amt+"is greater than balance"+this.balance);
		}
		System.out.println("");
		return amt;
	}
	@Override
	public String toString() {
		return "Account [account_holder_name=" + account_holder_name + ", accno=" + accno + ", balance=" + balance
				+ "]";
	}
	@Override
	 public boolean equals (Object ob) {
			return  this.accno == ((Account)ob).accno;
		 }

}
