
public class Student {
	public String name;
	private String id;
	int year;
	Student(String name, String id){
		this.name=name;
		this.id=id;
		this.year=1;
	}
		
	public void setName(String person) {
		name=person;
	}
	public String getname() {
		return name;
	}
	public void setID(String number) {
		id=number;
	}
	public String getID() {
		return id;
	}
	public void setYear(int Year) {
		year=Year;
	}
	public int setYear() {
		return year++;
	}
}

