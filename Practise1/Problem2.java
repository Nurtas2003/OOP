import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int Perimeter = 4*a;
		int Area = a*a;
		double Diagonal = Math.sqrt((a*a)+(a*a));
		System.out.println(Area+" "+Perimeter + " " + Diagonal);
		scan.close();
	}

}
