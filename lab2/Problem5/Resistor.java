package Problem5;

public class Resistor extends Circuit {
	private double R;
	private double pottentialDifference;
	
	Resistor(double R){
		this.R=R;
	}
	
	public double getResistance() {
		return this.R;
	}
	
	public void applyPotentialDiff(double V) {
		this.pottentialDifference=V;
	}
	
	public void setPotentialDiff(double pottentialDifference) {
		this.pottentialDifference=pottentialDifference;
	}

	public double getPotentialDiff() {
		return pottentialDifference;
	}
}
