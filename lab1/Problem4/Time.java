package Problem4;

public class Time {
	int hour;
	int minute;
	Time(){
		
	}
	
	Time(int hour, int minute){
		this.hour = hour;
		this.minute=minute;
	}
	
	public String ToString() {
		return this.hour + ":" + this.minute;
	}
}
