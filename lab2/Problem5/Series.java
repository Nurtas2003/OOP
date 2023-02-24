package Problem5;

public class Series extends Circuit{
	Circuit R1;
	Circuit R2;
	
	public Series(Circuit R1, Circuit R2){
		this.R1=R1;
		this.R2=R2;
	}
	
	public double getResistance() {
		return this.R1.getResistance()+this.R2.getResistance();
	}

	public double getPotentialDiff() {
		return (this.R1.getResistance()*this.getCurrent())+(this.R2.getResistance()*this.getCurrent());
	}

	public void applyPotentialDiff(double V) {
		double I = V/this.getResistance();
		this.R1.applyPotentialDiff(I*this.R1.getResistance());
		this.R2.applyPotentialDiff(I*this.R2.getResistance());
	}
}
