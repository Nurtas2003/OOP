package Problem4;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Account Number: ");
		int accNumber = sc.nextInt();
		Account a = new Account(accNumber);
		Account b = new Account(16);
		Account c = new Account(88);
		Account d = new Account(2);
		Bank bank = new Bank();
		b.deposit(200);
		b.withdraw(110);
		b.transfer(50, c);
		bank.add(b);
		bank.add(c);
		bank.add(d);
		bank.add(a);
		bank.print();
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
		sc.close();
	}

}
