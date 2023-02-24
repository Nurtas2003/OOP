package Problem5;
public class TestDragon {

	public static void main(String[] args) {
		Person b = new Person(Gender.BOYS, 19);
		Person g = new Person(Gender.GIRLS, 18);
		Person b1 = new Person(Gender.BOYS, 17);
		Person g1 = new Person(Gender.GIRLS, 15);
		Person s = new Superman(Gender.BOYS, 18);
		DragonLaunch dragon = new DragonLaunch();
		dragon.kidnap(b);
		dragon.kidnap(g);
		dragon.kidnap(g);
		dragon.kidnap(b);
		dragon.kidnap(s);
		dragon.kidnap(b1);
		dragon.kidnap(g1);
		dragon.willDragonEatOrNot();
	}

}
