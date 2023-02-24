import java.util.Scanner;
public class Problems1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.next();
		String tt = "";
		for(int i=0; i<name.length(); i++) {
			tt+='-';
		}
		System.out.println('+' + tt + '+');
		System.out.println('|' + name + '|');
		System.out.println('+' + tt + '+');
		in.close();
	}

}
