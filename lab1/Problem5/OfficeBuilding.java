package Problem5;

public class OfficeBuilding extends Building {
	int numberOfOffice;
	
	OfficeBuilding(int numberOfOffice, int floor){
		super(floor);
		this.numberOfOffice=numberOfOffice;
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		OfficeBuilding of = (OfficeBuilding) o;
		return of.numberOfOffice==this.numberOfOffice;
	}
}
