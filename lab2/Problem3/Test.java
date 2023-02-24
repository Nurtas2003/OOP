package Problem3;

public class Test {

	public static void main(String[] args) {
		Slon sl = new Slon(new Position('E', 8), '1');		
		System.out.println(sl.isLegalMove(new Position('E', 8)));
	}

}
