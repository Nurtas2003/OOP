package Problem5;

public class Parallel extends Circuit{
	Circuit R1;
	Circuit R2;
	
	Parallel(Circuit R1, Circuit R2){
		this.R1=R1;
		this.R2=R2;
	}
	
	public double getResistance() {
		return (this.R1.getResistance()*this.R2.getResistance())/(this.R1.getResistance()+this.R2.getResistance());
	}

	public double getPotentialDiff() {
		return R1.getPotentialDiff();
	}
	
	public void applyPotentialDiff(double V) {
		this.R1.applyPotentialDiff(V);
		this.R2.applyPotentialDiff(V); // U1=U2=U;
	}

}
