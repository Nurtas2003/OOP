package Problem4;

public class SavingAccount extends Account{
	double percent;
	public SavingAccount(int accNumber) {
		super(accNumber);
		this.percent=0.14;
	}
	
	public void deposit(double sum) {
		double newBal = sum*percent;
		super.deposit(newBal);
	}
}
