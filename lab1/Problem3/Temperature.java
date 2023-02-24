package Problem3;

public class Temperature {
	private double val;
	private char scale;
	
	Temperature(){
	}
	
	Temperature(double val){
		this.val=val;
	}
	
	Temperature(char scale){
		this.scale=scale;
	}
	
	Temperature(double val, char scale){
		this.val=val;
		this.scale=scale;
	}
	
	public double inCelsius() {
		if(this.scale=='C') {
			return (5*(val-32))/9;	
		} else {
			return this.val;
		}
	}
	
	public double inFahrenheit() {
		if(this.scale=='F') {
			return (9*(val/5))+32;	
		} else {
			return this.val;
		}
	}
	
	public void setValues(double val) {
		this.val=val;
	}
	
	public void setScale(char scale) {
		this.scale=scale;
	}
	// 31 C + 21 F = 52 C
	public void setValuesScale(double val, char scale) {
		this.val=val;
		this.scale=scale;
	}
	
	public double getValues() {
		return val;
	}
	
	public char getScale() {
		return scale;
	}
	
	public void plus(Temperature t2) {
	//	this.val t2.val
		if(this.scale=='F') {
			this.scale += t2.inFahrenheit();
		} else {
			this.scale += t2.inCelsius();
		}
//		this.val = this.val + t2.val;
	
	}
	
	public String toString() {
		return this.val + "" + this.scale;
	}
}
