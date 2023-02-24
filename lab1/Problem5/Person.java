package Problem5;

public class Person {
	private Gender g;
	private int year;
	
	Dragon dr = new Dragon();
	
	Person(Gender g, int year){
		this.g=g;
		this.year=year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year=year;
	}
	
	public Gender getGender() {
		return g;
	}
	
	public String toString() {
		if(dr.youngDragon()) {
			return "Dragon eat";
		} else {
			return "Dragon NOT eat";
		}
	}
}
