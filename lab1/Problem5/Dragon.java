package Problem5;

public class Dragon extends DragonLaunch{
	int wingsSize;
	boolean youngDragon() {
		for(Person people:hostages) {
			if(people.getYear()>=18) {
				return true;
			} 
		}
		return false;
	}
	
	public void willDragonEatOrNot() {
		for(Person people:hostages) {
			if(people instanceof Superman) {
				Superman s1 = (Superman) people;
				s1.kill();
				hostages.removeAllElements();
			}
		}
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Dragon d = (Dragon)o;
		return d.wingsSize == this.wingsSize;
	}
}
