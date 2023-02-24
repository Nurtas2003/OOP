package Problem1;

import java.util.Scanner;

public class TestProblem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int h = sc.nextInt();
		int a = sc.nextInt();
		Shape3D f1 = new Sphere(r);
		System.out.println(f1);
		Shape3D f2 = new Cylinder(r, h);
		System.out.println(f2);
		Shape3D f3 = new Cube(a);
		System.out.println(f3);
		sc.close();
	}
}
