import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int D=(b*b)-(4*a*c);
		double x1, x2;
		if(D>0) {
			x1=((-1*b)-Math.sqrt(D))/(2*a);
			x2=((-1*b)+Math.sqrt(D))/(2*a);
			System.out.println(x1 + " " + x2);
		}
		if(D==0) {
			x1=x2=(-1*b)/(2*a);
			System.out.println(x1);
		}
		if(D<0) {
			System.out.println("Error");
		}
		scan.close();
	}

}
