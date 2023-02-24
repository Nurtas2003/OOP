
public class Dog extends Animal{
	private String color;
	public Dog(String name, boolean veg, String food, int numberOfLegs, String color) {
		super(name, veg, food, numberOfLegs);
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void sound() {
        System.out.println("gav");
    }
	public void move() {
        System.out.println("Dogs can walk and run");
    }
	
	public String toString() {
		return this.getName() + " " + this.getVegetarian() + " " + this.getEats() + " " + this.getColor();
	}
}
