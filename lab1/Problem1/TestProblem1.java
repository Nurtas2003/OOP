package Problem1;
import java.util.Scanner;

public class TestProblem1 {
	public static void main(String[] args) {
		Data d = new Data();
		Scanner sc = new Scanner(System.in);
		int a = 0;
		while(true) {
			System.out.println("Enter number (Q to quit): ");
			String s  = sc.next();
			if(s.equals("Q")) break;
			a = Integer.parseInt(s);
			d.AddVal(a);
		}
		
		System.out.println("Average = " + d.Average());
		System.out.println("Maximum = " + d.MaxVal());
		System.out.Prinln(d);
	}
}
