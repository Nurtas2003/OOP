package Problem2;

public class Problem2 {
	private final String name = "Nurtas"; 
	int year;
	Month m;
	
	{
		year++;
	}
	Problem2(int year, Month m){
		this.year=year;
		this.m=m;
	}
	public String toString() {
		return "My name is "+ name+ ". I'm "+ year + ". My birthday is in "+ m  + ".";
	}
}
