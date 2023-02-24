
abstract public class Animal {
	private String name;
	private boolean vegetarian;
	private String eats;
	private int numberOfLegs;
	public Animal() {
	}
	
	public Animal(String name, boolean veg, String food, int numberOfLegs) {
		this.name=name;
		this.vegetarian=veg;
		this.eats=food;
		this.numberOfLegs=numberOfLegs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public boolean getVegetarian() {
		return vegetarian;
	}
	
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	
	public String getEats() {
		return eats;
	}

	public void setEats(String eats) {
		this.eats = eats;
	}
	
	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs=numberOfLegs;
	}
	
	abstract public void sound();
	
	public void move() {
		System.out.println("Animals can move");
	}
	
	public int numberOfLegs(int numberOfLegs) {
		return this.numberOfLegs;	
	}
	
	public String numberOfLegs(String numberOfLegs) {
		return this.numberOfLegs + " ";	
	}
	
	public String toString() {
		return this.getName() + " " + this.getVegetarian() + " " + this.getEats();
	}
}
