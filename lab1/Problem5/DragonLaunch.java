package Problem5;
import java.util.Vector;
public class DragonLaunch {
	public Vector<Person> hostages;
	{
		 hostages = new Vector<Person>();
	}
	
	public void kidnap(Person p) {
		hostages.add(p);
	}
	
	public void willDragonEatOrNot() {
		int people_size = 0;
		boolean result = true;
		for(Person people:hostages) {
			if(people instanceof Superman) {
				Superman s1 = (Superman) people;
				s1.kill();
			}
			if(people.getGender()==Gender.BOYS) {
				people_size++;
			} else {
				if(people_size>0) {
					people_size--;
				} else {
					result = false;
				}
			}
		}
		if(people_size==0 && result==true) {
			System.out.println("Magic of love");
		} else {
			System.out.println("Dragon launch");
		}
	}
}
