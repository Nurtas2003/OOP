package Problem3;

public class Queen extends Piece{
	Queen(Position p, char fig){
		super(p ,fig);
	}
	
	public boolean isLegalMove(Position b) {
		if(!super.checkBounds(b)) return false;
		if(this.getPos().c!=b.c && this.getPos().pos==b.pos) return true;
		else if(this.getPos().c==b.c && this.getPos().pos!=b.pos) return true;
		else if(Math.abs((int)this.getPos().c-(int)(b.c))==Math.abs(this.getPos().pos-b.pos)) return true;
		return false;
	}
}
