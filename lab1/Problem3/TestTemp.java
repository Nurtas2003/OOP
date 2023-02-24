package Problem3;


public class TestTemp {

	public static void main(String[] args) {
		Temperature temp1 = new Temperature(100, 'C');
		Temperature temp2 = new Temperature(100, 'F');
		Temperature temp3 = new Temperature(200, 'C');
		System.out.println(temp1.inCelsius(temp1.getValues()));
		System.out.println(temp2.inFahrenheit(temp2.getValues()));
		System.out.println(temp3.inFahrenheit(temp3.getValues()));
	}

}
