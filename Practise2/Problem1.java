
public class Problem1 {
	public static void main(String[] args) {
		Student s = new Student("Nurtas", "21B030921");
		s.setName("Nurtas");
		String s_name=s.getname();
		System.out.println("Student name: "+ s_name);
		s.setID("21B030921");
		String s_id=s.getID();
		System.out.println("Student ID: "+ s_id);
		s.setYear();
		int s_year=s.setYear();
		System.out.println("Student year of study: "+ s_year);
		
	}
}
