package Problem4;

public class CheckingAccount extends Account{
	int transactions;
	int FREE_TRANSACTIONS=2;
	
	public CheckingAccount(int accNumber) {
		super(accNumber);
	}
	
	public void deposit(double sum) {
		super.deposit(sum);
		transactions+=1;
	}
	
	public void deductFee(double sum) {
		if(transactions>FREE_TRANSACTIONS) {
			super.withdraw(0.02);
		}
	}
	
	public String toString() {
		return "Transaction: " + this.transactions;
	}
}
