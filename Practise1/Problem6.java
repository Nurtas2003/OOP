import java.util.Scanner;
public class Problem6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		String t="";
		for(int i=s.length()-1; i>=0; i--) {
			t+= s.charAt(i);
		}
//		System.out.println(t);
		
		String result = (s.equals(t)) ? "Palindrome" : "NO";
		System.out.println(result);
		scan.close();
	}
}
