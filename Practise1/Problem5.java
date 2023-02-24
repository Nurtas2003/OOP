import java.util.Scanner;
public class Problem5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int per = scan.nextInt();
		double res = (num*per)/100;
		System.out.println(res);
		scan.close();
	}
}
