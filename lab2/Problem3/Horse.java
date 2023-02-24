package Problem3;

public class Horse extends Piece{
	Horse(Position p, char fig){
		super(p ,fig);
	}
	
	public boolean isLegalMove(Position b) {
		if(!super.checkBounds(b)) return false;
		if(Math.abs((int)this.getPos().c-(int)(b.c))==1 && Math.abs(this.getPos().pos-b.pos)==1) return true;
		else if(Math.abs((int)this.getPos().c-(int)(b.c))==2 && Math.abs(this.getPos().pos-b.pos)==1) return true;
		return false;
	}
}
