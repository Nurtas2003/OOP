package Problem3;

public class Slon extends Piece {
	Slon(Position p, char fig){
		super(p ,fig);
	}
	
	public boolean isLegalMove(Position b) {
		if(!super.checkBounds(b)) return false;
		if(Math.abs((int)this.getPos().c-(int)(b.c))==Math.abs(this.getPos().pos-b.pos)) return true;
		return false;
	}
	
}
