package Problem4;

import java.util.Vector;

public class Bank {
	public Vector<Account> v;
	{
		v = new Vector<Account>();
	}
	
	public void add(Account a) {
		if(v.isEmpty()==true) {
			v.add(a);
		}
		for(Account i:v) {
			if(i.equals(a)) {
				System.out.println("I Can't add");
				break;
			} else {
				v.add(a);
				System.out.println("OK");
				break;
			}
		}
	}
	
	public void remove(Account a) {
		v.remove(a);
	}
	
	public void Update() {
		for(Account i:v) {
			i.deposit(0);
			if(i instanceof SavingAccount) {
				SavingAccount s = (SavingAccount)i;
			} else if(i instanceof CheckingAccount) {
				CheckingAccount ch = (CheckingAccount)i;
			}
		}
	}
	
	public void print() {
		for(Account i:v) {
			System.out.println(i);
		}
	}
}
