package Problem5;

public class Building {
	int floor;
	
	Building(int floor){
		this.floor=floor;
	}
	
	public boolean equals(Object o) {
		if(this==o) return true;
		if(o==null) return false;
		if(this.getClass()!=o.getClass()) return false;
		Building b = (Building) o;
		return floor==b.floor;
		
	}
}
