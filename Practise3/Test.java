
public class Test {

	public static void main(String[] args) {
		Animal a = new Dog("Max", true, "meat", 4, "WHITE");
		Dog d = new Dog("Aktos", true, "meat", 4, "YELLOW");
		System.out.println(a);
		a.move();
		a.sound();
		d.move();
		d.sound();
	}

}
