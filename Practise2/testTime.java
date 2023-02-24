
public class testTime {

	public static void main(String[] args) {
		Time t1 = new Time(14, 23, 22);
		System.out.println("Universal: "+t1.toString());
		System.out.println("Standard: "+t1.Standard()+ " PM");
//		Time t2 = new Time(4, 24, 33);
//		t1.add(t2);
	}

}
