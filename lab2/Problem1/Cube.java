package Problem1;

public class Cube extends Shape3D {
	int a;
	
	Cube(int a){
		this.a=a;
	}
	
	double surfaceArea() {
		double s = 6*a*a;
		return s;
	}
	
	double volume() {
		double v = a*a*a;
		return v;
	}
	
	public String toString() {
		return "Cube surfacearea " + surfaceArea() + ", volume " + volume();
	}
}
