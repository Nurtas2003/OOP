package Problem4;
public class Course {
	String name;
	int credits;
	private Time time;
	Course prereq;
	String code;
	
	Course(String name, int credits, Time time, String code){
		this.name=name;
		this.credits=credits;
		this.time=time;
		this.code=code;
	}
	
	public Time getTime() {
		return time;
	}
	
	public void setTime(Time time) {
		this.time=time;
	}
	
	public String toString() {
		return "Welcome to the grade book for "+ code+ " "+ name + ", credits " + credits + ", time " + time + ".";
	}
	
}
