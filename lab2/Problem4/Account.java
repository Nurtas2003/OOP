package Problem4;

public class Account {
	private double balance;
	private int accNumber;
	public Account(int a) {
		balance=0.0;
		this.accNumber=a;
	}
	
	public void deposit(double sum) {
		this.balance+=sum;
	}
	
	public void withdraw(double sum) { 
		if(balance>sum) {
			this.balance-=sum;
		} else {
			this.balance=0;
		}
	}   
	
	public void setBalance(double B) {
		this.balance = B;
	}
	
	public double getBalance(){
		return this.balance;
	}   
	
	public double getAccountNumber(){
		return this.accNumber;
	}   
	
	public void transfer(double amount, Account other){
		this.withdraw(amount);
		other.deposit(amount);
	}
	
	public boolean equals(Object o) {
		if(this==o) return true;
		if(o==null) return false;
		if(this.getClass()!=o.getClass()) return false;
		Account acc = (Account) o;
		return accNumber==acc.accNumber;
	}
	
	public String toString(){   
		return "Person account number: " + getAccountNumber() + " Balance: $" + getBalance();
	}  
	
	public final void print(){   
		 System.out.println(toString());
	}
}
