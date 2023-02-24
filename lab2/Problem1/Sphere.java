package Problem1;

public class Sphere extends Shape3D {
	int radius;
	final double PI = 3.14;
	
	Sphere(int radius){
		this.radius=radius;
	}
	
	double surfaceArea() {
		double s=4*PI*radius*radius;
		return s;
	}
	
	double volume() {
		double v = (4/3)*PI*radius*radius*radius;
		return v;
	}
	
	public String toString() {
		return "Sphere surfacearea: " + surfaceArea() + ", volume: " + volume();
	}
}