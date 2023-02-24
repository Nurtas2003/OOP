package Problem2;

public class ContactFriends extends Contact{
	private Gender g;
	private int year;
	ContactFriends(int id, String firstName, String phoneNumber, int year, Gender g) {
		super(id, firstName, phoneNumber);
		this.g=g;
		this.year=year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year=year;
	}

	public void setGender(Gender g) {
		this.g=g;
	}
	
	public Gender getGender() {
		return g;
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		ContactFriends f = (ContactFriends)o;
		return f.year==this.year;
	}
	
}
