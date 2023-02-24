package Problem1;

public class Cylinder extends Shape3D {
	final double PI = 3.14;
	int radius;
	int height;
	
	Cylinder(int radius, int height){
		this.radius=radius;
		this.height=height;
	}
	
	double surfaceArea() {
		double s = 2*PI*radius*height;
		return s;
	}
	
	double volume() {
		double v = PI*radius*radius*height;
		return v;
	}
	
	public String toString() {
		return "Cylinder surfacearea: " + surfaceArea() + ". Cylinder volume: " + volume();
	}
}
