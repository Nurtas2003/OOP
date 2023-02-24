package Problem1;

public class Time {
	public int hour;
	public int minute;
	public int second;
	
	Time(int hour, int minute, int second){
		if(hour>=1 && hour<=23) {
			this.hour=hour;
		} else {
			hour =0;
		}
		if(minute>=1 && minute<=59) {
			this.minute=minute;
		} else {
			minute=0;
		}
		if(second>=1 && second<=59) {
			this.second=second;
		} else {
			second=0;
		}
	}
	public String toString() {
		String line="";
		if(hour<10 && minute<10 && second<10) {
			line="0"+hour+":0"+minute+":0"+second;
		}
		else if(hour<10 && minute<10 && second>9) {
			line="0"+hour+":0"+minute+":"+second;
		}
		else if(hour<10 && minute>9 && second<10) {
			line="0"+hour+":"+minute+":0"+second;
		}
		else if(hour<10 && minute>9 && second<10) {
			line="0"+hour+":"+minute+":0"+second;
		}
		else if(hour>9 && minute<10 && second<10) {
			line=hour+":0"+minute+":0"+second;
		}
		else if(hour<10 && minute>9 && second>9) {
			line="0"+hour+":"+minute+":"+second;
		}
		else if(hour>9 && minute<10 && second>9) {
			line=hour+":"+minute+":0"+second;
		}
		else if(hour>9 && minute>9 && second<10) {
			line=hour+":0"+minute+":"+second;
		}
		else if(hour>9 && minute>9 && second>9) {
			line=hour+":"+minute+":"+second;
		}
		return line;
	}
	
	public String Standard() {
		String line="";
		if(hour>12) {
			hour=hour-12;
			if(hour<10 && minute<10 && second<10) {
				line="0"+hour+":0"+minute+":0"+second;
			}
			else if(hour<10 && minute<10 && second>9) {
				line="0"+hour+":0"+minute+":"+second;
			}
			else if(hour<10 && minute>9 && second<10) {
				line="0"+hour+":"+minute+":0"+second;
			}
			else if(hour<10 && minute>9 && second<10) {
				line="0"+hour+":"+minute+":0"+second;
			}
			else if(hour>9 && minute<10 && second<10) {
				line=hour+":0"+minute+":0"+second;
			}
			else if(hour<10 && minute>9 && second>9) {
				line="0"+hour+":"+minute+":"+second;
			}
			else if(hour>9 && minute<10 && second>9) {
				line=hour+":"+minute+":0"+second;
			}
			else if(hour>9 && minute>9 && second<10) {
				line=hour+":0"+minute+":"+second;
			}
			else if(hour>9 && minute>9 && second>9) {
				line=hour+":"+minute+":"+second;
			}
		}
		return line;
	}
}
