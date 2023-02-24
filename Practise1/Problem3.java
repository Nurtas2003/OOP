import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		if(num>0 && num<50) {
			System.out.println("F");
		}
		if(num>49 && num<55) {
			System.out.println("D");
		}
		if(num>54 && num<60) {
			System.out.println("D+");
		}
		if(num>59 && num<65) {
			System.out.println("C-");
		}
		if(num>64 && num<70) {
			System.out.println("C");
		}
		if(num>69 && num<75) {
			System.out.println("C+");
		}
		if(num>74 && num<80) {
			System.out.println("B-");
		}
		if(num>79 && num<85) {
			System.out.println("B");
		}
		if(num>84 && num<90) {
			System.out.println("B+");
		}
		if(num>89 && num<95) {
			System.out.println("A-");
		}
		if(num>94 && num<101) {
			System.out.println("A");
		}
		scan.close();
	}

}
