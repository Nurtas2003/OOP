package Problem1;
public class Data {
	private double max;
	private double sum;
	private int size;
	
	Data(){
	}
	
	public void AddVal(double val){
		if(max<val) {
			max=val;
		}
		sum+=val;
		size++;
	}
	
	public double MaxVal() {
		return max;
	}
	
	public double Average(){
		return sum/size;
	}
	
	public String toString() {
		return MaxVal() + " " + Average();
	}
}
