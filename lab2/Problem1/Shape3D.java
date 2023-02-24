package Problem1;

public abstract class Shape3D {
	abstract double surfaceArea();

	abstract double volume();
	
	public String toString() {
		return surfaceArea() + " " + volume();
	}
	
//	public boolean equals(Object o) {
//		if(this==o) return true;
//		if(o==null) return false;
//		if(this.getClass()!=o.getClass()) return false;
//		Shape3D sh = (Shape3D) o;
//		return this.surfaceArea()=sh.surfaceArea() && this.volume().equals(sh.volume());
//	}
	
	
}
